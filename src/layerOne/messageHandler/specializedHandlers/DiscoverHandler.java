/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layerOne.messageHandler.specializedHandlers;

import layerOne.data.logs.ClientMap;
import layerOne.data.packageConstructor.PackageFactory;
import layerOne.data.packages.DataDiscoverUnit;

/**
 *
 * @author Angelo
 */
public class DiscoverHandler extends SpecializedHandler{
    
    public DiscoverHandler(PackageFactory pckgFactory){
        super(pckgFactory);
    }
    
    public void handleData(DataDiscoverUnit data){
        System.err.println("in disc");
        ClientMap.getInstance().addHost(data.getIp());
        // TODO send update / Discover response
    }
}
