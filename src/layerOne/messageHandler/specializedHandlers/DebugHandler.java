/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layerOne.messageHandler.specializedHandlers;

import layerOne.data.logs.ClientMap;
import layerOne.data.packageConstructor.PackageFactory;
import layerOne.data.packages.DataDebugUnit;

/**
 *
 * @author Angelo
 */
public class DebugHandler extends SpecializedHandler{
    // TODO print the debug
    
    public DebugHandler(PackageFactory pckgFactory){
        super(pckgFactory);
    }
    
    public void handleData(DataDebugUnit data){
        System.err.println("in debug");
        ClientMap.getInstance().addHost(data.getIp());
    }
    
}
