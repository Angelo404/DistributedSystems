/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicLayer.networking;

import basicLayer.data.BasicLayerConfig;
import basicLayer.data.packages.DataUnit;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import basicLayer.utils.DataTranslatorBasicLayer;
import utils.Parser;

/**
 * 
 * @author Angelo
 */
public class UDPBridge extends NetworkBridge{

    private final byte[] receiveData;
    private DatagramSocket socket;
    private DatagramPacket receivePacket;
    private byte[] data;
    private DataUnit msg;
    private final Collection<DataUnit> msgQueueSync;
        
    public UDPBridge(Collection<DataUnit> msgQueueSync){
        super();
        receiveData = new byte[BasicLayerConfig.PCKGSIZE];
        this.msgQueueSync = msgQueueSync;
        createSocket();
    }

    public void createSocket(){
        try {
            socket = new DatagramSocket(port, ip);
        } catch (SocketException ex) {
            Logger.getLogger(UDPBridge.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void run(){
        while(!this.currentThread().isInterrupted()){
            receivePacket = new DatagramPacket(receiveData, receiveData.length);
            try {
                socket.receive(receivePacket);
            } catch (IOException ex) {
                Logger.getLogger(UDPBridge.class.getName()).log(Level.SEVERE, null, ex);
            }
            data = receivePacket.getData();
            msg = DataTranslatorBasicLayer.bytesToObject(data);
            msgQueueSync.add(msg);
        }
    }
    
    public static void boradcastPackage(DataUnit data){
        byte[] dataBytes = DataTranslatorBasicLayer.objectToBytes(data);
        try {
            InetAddress group = InetAddress.getByName("127.0.0.1");
            DatagramSocket tmpSocket = null;
            DatagramPacket tmpPacket = new DatagramPacket(dataBytes, dataBytes.length, group, BasicLayerConfig.PORT);
            tmpSocket = new DatagramSocket();
            tmpSocket.send(tmpPacket);
            tmpSocket.close();
        } catch (UnknownHostException ex) {
            Logger.getLogger(UDPBridge.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SocketException ex) {
            Logger.getLogger(UDPBridge.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UDPBridge.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void multicastPackage(DataUnit data, InetAddress ip) {
        byte[] dataBytes = DataTranslatorBasicLayer.objectToBytes(data);
        DatagramSocket tmpSocket = null;
        DatagramPacket tmpPacket = new DatagramPacket(dataBytes, dataBytes.length, ip, BasicLayerConfig.PORT);
        try {
            tmpSocket = new DatagramSocket();
            tmpSocket.send(tmpPacket);
            tmpSocket.close();
        } catch (IOException ex) {
            Logger.getLogger(UDPBridge.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void multicastPackage(DataUnit data, String ip) {
        multicastPackage(data, Parser.strToInet(ip));
    }

    public static void multicastPackage(DataUnit data, ArrayList<InetAddress> ips) {
        ips.stream().forEach((tmpIp) -> {
            multicastPackage(data, tmpIp);
        });
    }


    @Override
    public void terminateConnection() {
        socket.close();
    }

}
