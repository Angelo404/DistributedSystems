/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientLayer.data.packages;

import java.util.UUID;

/**
 *
 * @author Angelo
 */
public abstract class ExecutionAnswerUnit extends ExecutionUnit {
    
    protected ExecutionAnswerUnit(UUID uuid){
        super(uuid);
    }
    
    @Override
    public String toString(){
        return super.toString() + " - Answer";
    }
    
}
