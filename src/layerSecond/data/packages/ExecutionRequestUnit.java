/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layerSecond.data.packages;

import java.util.UUID;


/**
 *
 * @author Angelo
 */
public class ExecutionRequestUnit extends ExecutionUnit{
    
    public ExecutionRequestUnit(UUID uuid){
        super(uuid);
    }
    
    
    @Override
    public String toString(){
        return super.toString() + " - Execution Request";
    }
    
    
}
