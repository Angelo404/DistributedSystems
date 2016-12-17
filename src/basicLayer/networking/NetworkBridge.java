/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicLayer.networking;

import basicLayer.data.BasicLayerConfig;
import java.net.InetAddress;
import utils.InitializerTimer;


/**
 *
 * @author Angelo
 */
public abstract class NetworkBridge extends Thread{
    
    protected int port;
    protected final InetAddress ip;
    
    public NetworkBridge(){
        this.ip = BasicLayerConfig.getIp();
        this.port = BasicLayerConfig.PORT;
    }
        
    public abstract void terminateConnection();
    
    public void terminateThread(){
        InitializerTimer.execute("Terminating thread...", 200);
        this.currentThread().interrupt();
    }

    @Override
    public void run() {
        while(!this.currentThread().isInterrupted()){

        }
    }    
    
}
