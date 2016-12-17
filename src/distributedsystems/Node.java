/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributedsystems;

import basicLayer.algorithms.Algo;
import basicLayer.algorithms.AlgoFactory;
import basicLayer.algorithms.AlgoType;
import basicLayer.daemons.Daemon;
import basicLayer.daemons.DaemonFactory;
import basicLayer.daemons.DaemonType;
import basicLayer.data.SyncQueue;
import basicLayer.data.logs.ClientMap;
import basicLayer.data.packageConstructor.PackageFactory;
import basicLayer.data.packages.DataUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import basicLayer.messageHandler.MessageHandler;
import basicLayer.networking.UDPBridge;
import clientLayer.data.Client;
import clientLayer.data.TaskQueue;
import clientLayer.networking.TCPServer;

/**
 *
 * @author Angelo
 */
public class Node extends Thread{

    private final UDPBridge networkBridge;
    private final SyncQueue dataUnitQueueSynch;
    private final MessageHandler msgHandler;
    private final PackageFactory pckgFactory;
    private final ClientMap clientMap;
    private final Algo algo;
    private final Daemon discoverDaemon;
    private final Daemon electionDaemon;
    private TaskQueue taskQueueSynch;
    
    public Node(){
        this.dataUnitQueueSynch =  new SyncQueue();
        this.networkBridge = new UDPBridge(dataUnitQueueSynch);
        this.pckgFactory = new PackageFactory();
        this.algo = AlgoFactory.createAlgo(AlgoType.BULLY, this.pckgFactory);
        this.msgHandler = new MessageHandler(algo, pckgFactory);
        this.clientMap = ClientMap.getInstance();
        this.discoverDaemon = DaemonFactory.createDaemon(DaemonType.DISCOVER_DAEMON, pckgFactory, algo);
        this.electionDaemon = DaemonFactory.createDaemon(DaemonType.ELECTION_DAEMON, pckgFactory, algo);
    }

    @Override
    public void run() {
        TCPServer tcpServer = new TCPServer();
        Client c = new Client();
        tcpServer.start();
        c.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Node.class.getName()).log(Level.SEVERE, null, ex);
        }
        tcpServer.send();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Node.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        c.killClient();
        
        while(true){}
//        networkBridge.start();
//        discoverDaemon.execute();
//        electionDaemon.execute();
//        while(!this.currentThread().isInterrupted()){
//            System.out.println("in node thread");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Node.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            //DataUnit tmpData = pckgFactory.constructPackage(DataType.DISCOVER);
//            
//            //UDPBridge.multicastPackage(tmpData, "127.0.0.1");
//            processIncomingData();
//        }
    }
    
    public void processIncomingData(){
        if(!dataUnitQueueSynch.isEmpty()){
            DataUnit tmpData = dataUnitQueueSynch.pop();
            tmpData.accept(this.msgHandler);
            System.out.println(tmpData);
            System.out.println(this.clientMap);
        }
    }
}
