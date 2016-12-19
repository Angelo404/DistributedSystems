/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientLayer.networking;

import basicLayer.networking.NetworkBridge;
import clientLayer.data.ClientLayerConfig;
import utils.InitializerTimer;

/**
 *
 * @author Angelo
 */
public abstract class TCPBridge extends NetworkBridge{
    
    
        
    public TCPBridge(){
        super();
        this.port = ClientLayerConfig.PORT;
    }

    @Override
    public void run(){
        
    }

    @Override
    public void terminateConnection() {
        terminateThread();
        InitializerTimer.execute("Terminating Bridge...", 200);
        
    }
}