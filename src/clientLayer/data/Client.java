/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientLayer.data;

import clientLayer.networking.TCPClient;
import java.sql.Timestamp;
import java.util.UUID;
import utils.InitializerTimer;

/**
 *
 * @author Angelo
 */
public class Client extends Thread{
    
    private Boolean busy;
    private Boolean alive;
    private final UUID uuid;
    private Timestamp actionTimestamp;
    private TCPClient tcpConnection;
    private final TaskQueue<String> taskQueue;
    private Boolean running;
    
    public Client(){
        this.busy = false;
        this.alive = true;
        this.running = true;
        this.uuid = UUID.randomUUID();
        this.actionTimestamp = new Timestamp(System.currentTimeMillis());
        this.taskQueue = new TaskQueue<>();
        this.tcpConnection = new TCPClient(this.taskQueue);
    }
    
    @Override
    public void run(){
        startReceiving();
        while(running | taskQueue.size() > 0){
            if(taskQueue.size() > 0){
                processIncominData(taskQueue.poll());
                actionPerformed();
            }
        }
    }
    
    public void startReceiving(){
        tcpConnection.start();
    }
    
    public void restartNetwork(){
        tcpConnection = new TCPClient(taskQueue);
    }
    
    public void processIncominData(String data){
        System.out.println(data);
    }
    
    public void actionPerformed(){
        actionTimestamp = new Timestamp(System.currentTimeMillis());
    }
    
    public Timestamp getLastAction(){
        return actionTimestamp;
    }
    
    public void setBusy(){
        busy = true;
    }
    
    public void setIdle(){
        busy = false;
    }
    
    public void setAlive(){
        alive = true;
    }
    
    public Boolean getAlive(){
        return alive;
    }
    
    public Boolean getBusy(){
        return busy;
    }
    
    public UUID getUUID(){
        return uuid;
    }
    
    public void killClient(){
        InitializerTimer.execute("Terminating client...", 200);
        tcpConnection.terminateConnection();  
    }
}