/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicLayer.messageHandler.specializedHandlers;

import basicLayer.data.logs.ClientMap;
import basicLayer.data.packageConstructor.PackageFactory;
import basicLayer.data.packages.DataDebugUnit;

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
