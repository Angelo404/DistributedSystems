package basicLayer.algorithms;

import basicLayer.data.packages.DataElectionUnit;
import basicLayer.data.packages.DataLeaderUnit;
import basicLayer.data.packages.DataWannabeLeaderUnit;
import java.util.concurrent.Callable;

/**
 * Superclass for election Algorithms.
 * @author Angelo
 */
public abstract class Algo implements Callable<String>{
    
    protected static boolean isParticipating;
    protected static boolean iAmLeader;
    
    public abstract void hasSeenHigher();
    public abstract boolean isParticipating();
    public abstract void newPerson();
    public abstract void newEllection();
    public abstract void handleData(DataLeaderUnit data);
    public abstract void handleData(DataElectionUnit data);
    public abstract void handleData(DataWannabeLeaderUnit data);
    public abstract void startElection();
    
    public Algo(){
        Algo.isParticipating = true;
        Algo.iAmLeader = false;
    }
    
    @Override
    public String call() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
