/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageHandler.specializedHandlers;

import data.logs.ClientMap;
import data.packageConstructor.PackageFactory;
import data.packages.DataDiscoverUnit;

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
