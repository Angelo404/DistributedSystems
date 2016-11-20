/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layerOne.networking;

import layerOne.data.Config;
import layerOne.data.packages.DataUnit;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import utils.Parser;


/**
 *
 * @author Angelo
 */
public abstract class NetworkBridge extends Thread{
    
    protected int port;
    protected final InetAddress ip;
    protected final Collection<DataUnit> msgQueueSync;
    
    public NetworkBridge(Collection<DataUnit> msgQueueSync){
        this.ip = Config.getIp();
        this.port = Config.PORT;
        this.msgQueueSync = msgQueueSync;
    }
    
    public abstract void terminateConnection();
    
    public void terminateThread(){
        this.currentThread().interrupt();
    }

    @Override
    public void run() {
        int i = 0;
        while(!this.currentThread().isInterrupted()){

        }
    }    
    
}
