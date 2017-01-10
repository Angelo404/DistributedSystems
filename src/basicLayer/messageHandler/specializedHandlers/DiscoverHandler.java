package basicLayer.messageHandler.specializedHandlers;

import basicLayer.data.logs.ClientMap;
import basicLayer.data.packageConstructor.PackageFactory;
import basicLayer.data.packages.DataDiscoverUnit;

/**
 * Handler for Discovery packages.
 * @author Angelo
 */
public class DiscoverHandler extends SpecializedHandler{
    
    /**
     * Constructor for the Discovery Handler.
     * @param pckgFactory PakcageFactory
     */
    public DiscoverHandler(PackageFactory pckgFactory){
        super(pckgFactory);
    }
    
    /**
     * Execute this when you receive a DataDiscover datagram.
     * TODO (NOT YET IMPLEMENTED)
     * @param data DataDiscoverUnit
     */
    public void handleData(DataDiscoverUnit data){
        System.err.println("in disc");
        ClientMap.getInstance().addHost(data.getIp());
        // TODO send update / Discover response
    }
}
