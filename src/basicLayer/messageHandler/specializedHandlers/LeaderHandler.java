package basicLayer.messageHandler.specializedHandlers;

import basicLayer.algorithms.Algo;
import basicLayer.data.packageConstructor.PackageFactory;
import basicLayer.data.packages.DataLeaderUnit;

/**
 * Handler for Leader packages.
 * @author Angelo
 */
public class LeaderHandler extends SpecializedHandler{
    
    /**
     * Constructor for the Leader Handler.
     * @param pckgFactory PackageFactory
     */
    public LeaderHandler(PackageFactory pckgFactory){
        super(pckgFactory);
    }
     /**
      * Forward the message received to the election algorithm.
      * @param data DataLeaderUnit
      * @param algo Algo
      */
    public void handleData(DataLeaderUnit data, Algo algo) {
        algo.handleData(data); 
    }
}
