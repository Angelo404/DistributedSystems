/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layerOne.messageHandler.specializedHandlers;

import layerOne.algorithms.Algo;
import layerOne.data.logs.ClientMap;
import layerOne.data.packageConstructor.PackageFactory;
import layerOne.data.packages.DataWannabeLeaderUnit;

/**
 *
 * @author Angelo
 */
public class WannabeLeaderHandler extends SpecializedHandler{
    
    public WannabeLeaderHandler(PackageFactory pckgFactory){
        super(pckgFactory);
    }
    
    public void handleData(DataWannabeLeaderUnit data, Algo algo){
        ClientMap.getInstance().addHost(data.getIp());
        algo.handleData(data);
    }
    
}
