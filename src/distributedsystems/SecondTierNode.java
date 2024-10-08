/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributedsystems;

import clientLayer.networking.TCPBridge;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angelo
 */
public class SecondTierNode extends Thread{
    
    protected Boolean isRunning;
    protected TCPBridge network;

    private SecondTierBehaviour currentBehaviour;
    private SecondTierBehaviour tmpBehaviour;
    
    public SecondTierNode(){
        currentBehaviour = new ClientBehaviour();
    }  
    
    public void switchBehaviour(){
        tmpBehaviour = currentBehaviour.switchBehaviour();
        setBehaviour(tmpBehaviour);
    }
    
    public void setBehaviour(SecondTierBehaviour behaviour){
        currentBehaviour.killPrevBehaviour();
        currentBehaviour = behaviour;
    }
    
    public void assumeBehaviour(){
        currentBehaviour.assume();
    }
    
    public void killBehaviour(){
        currentBehaviour.killPrevBehaviour();
    }
    
}
