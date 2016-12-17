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
    
    protected Boolean running;
        
    public TCPBridge(){
        super();
        this.running = true;
        this.port = ClientLayerConfig.PORT;
    }

    @Override
    public void run(){
        
    }

    @Override
    public void terminateConnection() {
        InitializerTimer.execute("Terminating loop...", 200);
        this.running = false;
        super.terminateThread();
    }
}