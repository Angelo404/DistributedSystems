package basicLayer.messageHandler.specializedHandlers;

import basicLayer.algorithms.Algo;
import basicLayer.data.logs.ClientMap;
import basicLayer.data.packageConstructor.PackageFactory;
import basicLayer.data.packages.DataWannabeLeaderUnit;

/**
 * Handler for WannabeLeader Packages.
 * @author Angelo
 */
public class WannabeLeaderHandler extends SpecializedHandler{
    
    /**
     * Constructor for the WannabeLeader Handler.
     * @param pckgFactory PackageFactory
     */
    public WannabeLeaderHandler(PackageFactory pckgFactory){
        super(pckgFactory);
    }
    
    /**
     * When receive a new WannabeLeader package update the
     * ClientMap (this should not be done here TODO to be removed.
     * And then it sends the package to the Algorithm for further process.
     * @param data DataWannabeLeaderUnit
     * @param algo Algo
     */
    public void handleData(DataWannabeLeaderUnit data, Algo algo){
        ClientMap.getInstance().addHost(data.getIp());
        algo.handleData(data);
    }
    
}
