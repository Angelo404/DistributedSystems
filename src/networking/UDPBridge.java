/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking;

import data.Config;
import data.packages.DataUnit;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.DataTranslator;
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
        
    public UDPBridge(Collection<DataUnit> msgQueueSync){
        super(msgQueueSync);
        receiveData = new byte[Config.PCKGSIZE];
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
            msg = DataTranslator.bytesToObject(data);
            msgQueueSync.add(msg);
        }
    }
    
    public static void boradcastPackage(DataUnit data){
        byte[] dataBytes = DataTranslator.objectToBytes(data);
        try {
            InetAddress group = InetAddress.getByName("127.0.0.1");
            DatagramSocket tmpSocket = null;
            DatagramPacket tmpPacket = new DatagramPacket(dataBytes, dataBytes.length, group, Config.PORT);
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
        byte[] dataBytes = DataTranslator.objectToBytes(data);
        DatagramSocket tmpSocket = null;
        DatagramPacket tmpPacket = new DatagramPacket(dataBytes, dataBytes.length, ip, Config.PORT);
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

    public static void sendPackage(TransmitionType type) {
        switch(type){
            case MULTICAST:
                break;
            case BROADCAST:
                break;
            default:
                break;
        }
    }

    @Override
    public void terminateConnection() {
        socket.close();
    }

}
