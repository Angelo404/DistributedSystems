/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layertwo.tasks;

import layertwo.data.packages.Params;

/**
 *
 * @author Angelo
 */
public abstract class Task{
    
    public Task(){
        
    }
    
    public abstract void giveParams(Params params);
    
    
        
    @Override
    public String toString(){
        return super.toString() + " - Task";
    }
    
}
