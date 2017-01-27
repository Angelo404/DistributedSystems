package basicLayer.algorithms;

import basicLayer.data.BasicLayerConfig;
import basicLayer.data.logs.ClientMap;
import basicLayer.data.packageConstructor.DataType;
import basicLayer.data.packageConstructor.PackageFactory;
import basicLayer.data.packages.DataElectionUnit;
import basicLayer.data.packages.DataLeaderUnit;
import basicLayer.data.packages.DataWannabeLeaderUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import basicLayer.networking.UDPBridge;


/**
 * This is the implementation of the bully algorithm for the leader elections.
 * @author Angelo
 */
public class BullyAlgo extends Algo{    

    private final PackageFactory pckgFactory;
    private final ClientMap clientMap;

    BullyAlgo(PackageFactory pckgFactory) {
        this.pckgFactory = pckgFactory;
        this.clientMap = ClientMap.getInstance();
    }

    /**
     * In case a higher ID has been seen stop participating.
     */
    @Override
    public void hasSeenHigher() {
        isParticipating = false;
    }
    
    /**
     * Return whether or not the node is participating in the elections.
     * @return boolean
     */
    @Override
    public boolean isParticipating() {
        return isParticipating;
    }

    /**
     * This will be invoked if a new node enters the network;
     * It will set isParticipating field to true.
     */
    @Override
    public void newPerson() {
        isParticipating = true;
    }

    /**
     * This will be invoked when a new election has been called.
     */
    @Override
    public void newEllection() {
        isParticipating = true;
    }

    /**
     * This will be invoked when a DataLeaderUnit is received;
     * It will set the new leader into the host index.
     * @param data DataLeaderUnit
     */
    @Override
    public void handleData(DataLeaderUnit data) {
        clientMap.setLeader(data.getIp());
    }

    /**
     * This will be invoked when a DataElectionUnit is received;
     * It will create a new WannabeLeader package, and broadcast it.
     * @param data DataElectionUnit
     */
    @Override
    public void handleData(DataElectionUnit data) {
        UDPBridge.multicastPackage(pckgFactory.constructPackage(DataType.WANNABELEADER), clientMap.getIps());
    }

    /**
     * This will be invoked when a WannabeLeader data unit is received;
     * It will compare the ID of the node that wants to be leader with 
     * its own node; If the remote node has higher ID then the host will
     * set the iAmLeader variable to false; If the remote node has smaller
     * ID then the host node will set the iAmLeader variable to false.
     * @param data DataWannabeLeaderUnit
     */
    @Override
    public void handleData(DataWannabeLeaderUnit data) {
        System.out.println("in algo wanna");
        if(data.getMachineUUID() > BasicLayerConfig.UUID)
            iAmLeader = false;
        if(data.getMachineUUID() < BasicLayerConfig.UUID)
            iAmLeader = true;
    }
    
    /**
     * This will be invoked when the host wants to start an election;
     * It will broadcast WannabeLeader data unit.
     */
    @Override
    public void startElection() {
        UDPBridge.multicastPackage(pckgFactory.constructPackage(DataType.WANNABELEADER), clientMap.getIps());
    }

    @Override
    public String call() {
        try {
            System.err.println("qwer");
            startElection();
            Thread.sleep(5000); // Just to demo a long running task of 4 seconds.
        } catch (InterruptedException ex) {
            Logger.getLogger(BullyAlgo.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(iAmLeader)
            System.err.println("I am leader");
        return "Ready!";
    }
}
