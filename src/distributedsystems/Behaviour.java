/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributedsystems;

import clientLayer.networking.TCPBridge;

/**
 *
 * @author Angelo
 */
public class Behaviour extends Thread{
    
    protected Boolean isRunning;
    protected TCPBridge network;
    
    public Behaviour(){
        System.out.println("in parent");
        this.isRunning = true;
    }
    
}
