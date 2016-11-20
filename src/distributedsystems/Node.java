/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributedsystems;

import algorithms.Algo;
import algorithms.AlgoFactory;
import algorithms.AlgoType;
import daemons.Daemon;
import daemons.DaemonFactory;
import daemons.DaemonType;
import data.SyncQueue;
import data.logs.ClientMap;
import data.packageConstructor.PackageFactory;
import data.packages.DataUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import messageHandler.MessageHandler;
import networking.UDPBridge;

/**
 *
 * @author Angelo
 */
public class Node extends Thread{

    private final UDPBridge networkBridge;
    private final SyncQueue msgQueueSynch;
    private final MessageHandler msgHandler;
    private final PackageFactory pckgFactory;
    private final ClientMap clientMap;
    private final Algo algo;
    private final Daemon discoverDaemon;
    private final Daemon electionDaemon;
    
    public Node(){
        this.msgQueueSynch =  new SyncQueue();
        this.networkBridge = new UDPBridge(msgQueueSynch);
        this.pckgFactory = new PackageFactory();
        this.algo = AlgoFactory.createAlgo(AlgoType.BULLY, this.pckgFactory);
        this.msgHandler = new MessageHandler(algo, pckgFactory);
        this.clientMap = ClientMap.getInstance();
        this.discoverDaemon = DaemonFactory.createDaemon(DaemonType.DISCOVER_DAEMON, pckgFactory, algo);
        this.electionDaemon = DaemonFactory.createDaemon(DaemonType.ELECTION_DAEMON, pckgFactory, algo);
    }

    @Override
    public void run() {
        networkBridge.start();
        discoverDaemon.execute();
        electionDaemon.execute();
        while(!this.currentThread().isInterrupted()){
            System.out.println("in node thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Node.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //DataUnit tmpData = pckgFactory.constructPackage(DataType.DISCOVER);
            
            //UDPBridge.multicastPackage(tmpData, "127.0.0.1");
            processIncomingData();
        }
    }
    
    public void processIncomingData(){
        if(!msgQueueSynch.isEmpty()){
            DataUnit tmpData = msgQueueSynch.pop();
            tmpData.accept(this.msgHandler);
            System.out.println(tmpData);
            System.out.println(this.clientMap);
        }
        
        
    }
}
