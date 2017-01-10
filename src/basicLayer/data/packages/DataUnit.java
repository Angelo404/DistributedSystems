
package basicLayer.data.packages;

import basicLayer.data.BasicLayerConfig;
import basicLayer.data.logs.ClientMap;
import java.io.Serializable;
import java.net.InetAddress;
import basicLayer.messageHandler.Handler;
import basicLayer.messageHandler.HandlerData;

/**
 * The DataUnit is the superclass for all the subclasses
 * of data units.
 * @author Angelo
 */
public abstract class DataUnit implements Serializable, Handler{
    
    private final InetAddress ip;
    private final ClientMap clientMap;
    private final int machineUUID;
    
    /**
     * DataUnit constructor.
     */
    public DataUnit(){
        this.ip = BasicLayerConfig.getIp();
        this.clientMap = ClientMap.getInstance();
        this.machineUUID = 1; // TODO remove this line in the future
    }
    
    /**
     * This will return the ip address of the sender.
     * @return InetAddress
     */
    public InetAddress getIp(){
        return this.ip;
    }
    
    /**
     * This will return the client map of the sender.
     * @return ClientMap
     */
    public ClientMap getClientMap(){
        return this.clientMap;
    }
    
    /**
     * 
     * @return int
     */
    public int getMachineUUID(){
        // TODO THIS HAS TO CHANGE EVENTUALLY.
        return machineUUID;
    }

    /**
     * This is called when the package has been received
     * and it is about to be handled by the receiver
     * Most likely it wont be used since this package cannot
     * exist
     * It is part of the Visitor pattern.
     * @param handlerSwitch HandlerData
     */
    @Override
    public void accept(HandlerData handlerSwitch) {
        handlerSwitch.execute(this);
    }
    
    @Override
    public String toString(){
        return "Data Unit Package - IP: " + this.ip;
    } 
}
