/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 *
 * @author Angelo
 */
public class BullyAlgo extends Algo{    

    private final PackageFactory pckgFactory;
    private final ClientMap clientMap;

    BullyAlgo(PackageFactory pckgFactory) {
        this.pckgFactory = pckgFactory;
        this.clientMap = ClientMap.getInstance();
    }

    @Override
    public void hasSeenHigher() {
        isParticipating = false;
    }
    
    @Override
    public boolean isParticipating() {
        return isParticipating;
    }

    @Override
    public void newPerson() {
        isParticipating = true;
    }

    @Override
    public void newEllection() {
        isParticipating = true;
    }

    @Override
    public void handleData(DataLeaderUnit data) {
        clientMap.setLeader(data.getIp());
    }

    @Override
    public void handleData(DataElectionUnit data) {
        UDPBridge.multicastPackage(pckgFactory.constructPackage(DataType.WANNABELEADER), clientMap.getIps());
    }

    @Override
    public void handleData(DataWannabeLeaderUnit data) {
        System.out.println("in algo wanna");
        if(data.getMachineUUID() > BasicLayerConfig.UUID)
            iAmLeader = false;
        if(data.getMachineUUID() < BasicLayerConfig.UUID)
            iAmLeader = true;
    }
    
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
