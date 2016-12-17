/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicLayer.data.packageConstructor;

import basicLayer.data.packages.DataUnit;
import error.warnings.WarningMessages;

/**
 * Factory pattern
 * @author Angelo
 */
public class PackageFactory {

    private final AckConstructor ackCon;
    private final DiscoverConstructor discCon;
    private final DiscRespConstructor discRespCon;
    private final ElectionConstructor electCon;
    private final LeaderConstructor leadCon;
    private final UpdateConstructor updateCon;
    private final DebugConstructor debugCon;
    private final WannabeLeaderConstructor wannabeLeaderCon;
    
    public PackageFactory(){
        ackCon = new AckConstructor();
        discCon = new DiscoverConstructor();
        discRespCon = new DiscRespConstructor();
        electCon = new ElectionConstructor();
        leadCon = new LeaderConstructor();
        updateCon = new UpdateConstructor();
        debugCon = new DebugConstructor();
        wannabeLeaderCon = new WannabeLeaderConstructor();
    }
    
    public DataUnit constructPackage(DataType type){
        DataUnit tmpData = null;
        
        switch(type){
            case ACK:
                tmpData = ackCon.createPackage();
                break;
            case DISCOVER:
                tmpData = discCon.createPackage();
                break;
            case DISCRESP:
                tmpData = discRespCon.createPackage();
                break;
            case ELECTION:
                tmpData = electCon.createPackage();
                break;
            case LEADER:
                tmpData = leadCon.createPackage();
                break;
            case UPDATE:
                tmpData = updateCon.createPackage();
                break;
            case DEBUG:
                tmpData = debugCon.createPackage();
                break;
            case WANNABELEADER:
                tmpData = wannabeLeaderCon.createPackage();
                break;
            default:
                System.err.println(WarningMessages.CONSTRUCTOR_SWITCH_MISSMATCH);
                break;
                
        }
        return tmpData;
        
    }
    
}
