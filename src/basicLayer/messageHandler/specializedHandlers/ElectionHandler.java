package basicLayer.messageHandler.specializedHandlers;

import basicLayer.algorithms.Algo;
import basicLayer.data.packageConstructor.PackageFactory;
import basicLayer.data.packages.DataElectionUnit;

/**
 * Handler for Election packages.
 * @author Angelo
 */
public class ElectionHandler extends SpecializedHandler{
    
    /**
     * Constructor for the Election Handler.
     * @param pckgFactory PackageFactory
     */
    public ElectionHandler(PackageFactory pckgFactory){
        super(pckgFactory);
    }
    
    
    /**
     * This will forward the Election package to the algorithm.
     * @param data DataElectionUnit
     * @param algo Algo
     */
    public void handleData(DataElectionUnit data, Algo algo) {
        algo.handleData(data);
        // TODO if you hear from someone higher shut up
    }
}
