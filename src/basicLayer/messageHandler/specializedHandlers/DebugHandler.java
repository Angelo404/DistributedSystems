package basicLayer.messageHandler.specializedHandlers;

import basicLayer.data.logs.ClientMap;
import basicLayer.data.packageConstructor.PackageFactory;
import basicLayer.data.packages.DataDebugUnit;

/**
 * Handler for Debug packages.
 * @author Angelo
 */
public class DebugHandler extends SpecializedHandler{
    
    /**
     * Constructor for the Debug Handler.
     * @param pckgFactory PackageFactory
     */
    public DebugHandler(PackageFactory pckgFactory){
        super(pckgFactory);
    }

    /**
     * Execute this when you receive a Debug package.
     * @param data DataDebugUnit
     */
    public void handleData(DataDebugUnit data){
        System.err.println("in debug");
        ClientMap.getInstance().addHost(data.getIp());
    }
    
}
