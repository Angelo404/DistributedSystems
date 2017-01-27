package basicLayer.messageHandler.specializedHandlers;

import basicLayer.data.packageConstructor.PackageFactory;
import basicLayer.data.packages.DataUpdateUnit;

/**
 * Handler for Update packages.
 * @author Angelo
 */
public class UpdateHandler extends SpecializedHandler{
    
    /**
     * Constructor for the Update Handler.
     * @param pckgFactory PakcageFactory
     */
    public UpdateHandler(PackageFactory pckgFactory){
        super(pckgFactory);
    }
    
    /**
     * Execute this when you receive an Update package;
     * TODO (I AM NOT SURE IF THIS NEEDS MORE FUNCTIONALITY
     * LEAVE IT LIKE THIS TILL I THINK OF SOMETHING).
     * @param data DataUpdateUnit
     */
    public void handleData(DataUpdateUnit data){
        System.out.println(data); // TODO implement
    }

}
