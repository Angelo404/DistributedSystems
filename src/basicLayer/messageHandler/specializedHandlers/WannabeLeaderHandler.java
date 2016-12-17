/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicLayer.messageHandler.specializedHandlers;

import basicLayer.algorithms.Algo;
import basicLayer.data.logs.ClientMap;
import basicLayer.data.packageConstructor.PackageFactory;
import basicLayer.data.packages.DataWannabeLeaderUnit;

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
