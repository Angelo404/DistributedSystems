package basicLayer.networking;

import basicLayer.data.BasicLayerConfig;
import java.net.InetAddress;
import utils.InitializerTimer;


/**
 * This works as the basis for all networking instances whether 
 * they are TCP or UDP.
 * @author Angelo
 */
public abstract class NetworkBridge extends Thread{
    
    protected int port;
    protected final InetAddress ip;
    protected Boolean running;
    
    public NetworkBridge(){
        this.ip = BasicLayerConfig.getIp();
        this.port = BasicLayerConfig.PORT;
        this.running = true;
    }
        
    public abstract void terminateConnection();
    
    public void terminateThread(){
        
        running = false;
        InitializerTimer.execute("Terminating thread...", 200);
    }

    @Override
    public void run() {
        while(!this.currentThread().isInterrupted()){

        }
    }    
    
}
