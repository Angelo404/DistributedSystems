/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicLayer.messageHandler.specializedHandlers;

import basicLayer.data.logs.ClientMap;
import basicLayer.data.packageConstructor.PackageFactory;
import java.net.InetAddress;
import utils.Parser;

/**
 *
 * @author Angelo
 */
public class SpecializedHandler {
    
    protected ClientMap clientMap = ClientMap.getInstance();
    protected final PackageFactory pckgFactory;
    
    public SpecializedHandler(PackageFactory pckgFactory){
        this.pckgFactory = pckgFactory;
    }
    
    protected void updateVector(InetAddress ip){
        clientMap.addHost(ip);
        // TODO update just the other person's vector clock or mine too?
    }
    
    protected void updateVector(String ip){
        updateVector(Parser.strToInet(ip));
    }    
    
    protected void echo(String msg){
        System.out.println(msg);
    }
    
}
