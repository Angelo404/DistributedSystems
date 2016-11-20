/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.packages;

import data.Config;
import data.logs.ClientMap;
import java.io.Serializable;
import java.net.InetAddress;
import messageHandler.Handler;
import messageHandler.HandlerData;

/**
 *
 * @author Angelo
 */
public abstract class DataUnit implements Serializable, Handler{
    
    private final InetAddress ip;
    private final ClientMap clientMap;
    private final int machineUUID;
    
    public DataUnit(){
        this.ip = Config.getIp();
        this.clientMap = ClientMap.getInstance();
        this.machineUUID = 1;
    }

    
    public InetAddress getIp(){
        return this.ip;
    }
    
    public ClientMap getClientMap(){
        return this.clientMap;
    }
    
    public int getMachineUUID(){
        return machineUUID;
    }

    @Override
    public void accept(HandlerData handlerSwitch) {
        handlerSwitch.execute(this);
    }
    
    @Override
    public String toString(){
        return "Data Unit Package - IP: " + this.ip;
    }
    
}
