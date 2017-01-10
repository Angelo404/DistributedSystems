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
 * This is the parent class for all the different handlers
 * @author Angelo
 */
public abstract class SpecializedHandler {
    
    protected ClientMap clientMap = ClientMap.getInstance();
    protected final PackageFactory pckgFactory;
    
    /**
     * Constructor for the handlers.
     * @param pckgFactory PackageFactory
     */
    public SpecializedHandler(PackageFactory pckgFactory){
        this.pckgFactory = pckgFactory;
    }
    
    /**
     * This is used to update the vector clock every time a package
     * is received.
     * @param ip InetAddress
     */
    protected void updateVector(InetAddress ip){
        clientMap.addHost(ip);
        // TODO update just the other person's vector clock or mine too?
    }
    
    /**
     * This is used to update the vector clock every time a package
     * is received.
     * @param ip String
     */
    protected void updateVector(String ip){
        updateVector(Parser.strToInet(ip));
    }    
    
    /**
     * This will print the content of the package. As is now, it is
     * only useful for debug purposes.
     * @param msg String
     */
    protected void echo(String msg){
        System.out.println(msg);
    }
    
}
