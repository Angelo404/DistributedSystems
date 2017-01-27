package basicLayer.messageHandler.specializedHandlers;

import basicLayer.data.packageConstructor.PackageFactory;
import basicLayer.data.packages.DataDiscRespUnit;

/**
 * Handler for Discovery packages.
 * @author Angelo
 */
public class DiscRespHandler extends SpecializedHandler{
    
    /**
     * Constructor for the Discovery Response Handler.
     * @param pckgFactory PackageFactory
     */
    public DiscRespHandler(PackageFactory pckgFactory){
        super(pckgFactory);
    }
    
    /**
     * Execute when you receive a Discovery Response package;
     * TODO (NOT YET IMPLEMENTED).
     * @param data DataDiscRespUnit
     */
    public void handleData(DataDiscRespUnit data){
    
    }

}
