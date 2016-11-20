/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layertwo.tasks;

/**
 *
 * @author Angelo
 */
public abstract class Task {
    
    public Task(){
        
    }
    
        
    @Override
    public String toString(){
        return super.toString() + " - Task";
    }
    
}
