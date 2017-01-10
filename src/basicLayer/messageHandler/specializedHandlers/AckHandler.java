package basicLayer.messageHandler.specializedHandlers;

import basicLayer.data.packageConstructor.PackageFactory;
import basicLayer.data.packages.DataAckUnit;

/**
 * Handler for Acknowledgement packages.
 * @author Angelo
 */
public class AckHandler extends SpecializedHandler {
    
    /**
     * Constructor for the Acknowledgement handler.
     * @param pckgFactory PackageFactory
     */
    public AckHandler(PackageFactory pckgFactory){
        super(pckgFactory);
    }

    /**
     * Execute this when you receive an Acknowledgement package.
     * TODO (NOT YET IMPLEMENTED)
     * @param data DataAckUnit
     */
    public void handleData(DataAckUnit data) {

    }
}
