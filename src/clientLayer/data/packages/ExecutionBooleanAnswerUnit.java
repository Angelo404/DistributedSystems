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
public class ExecutionBooleanAnswerUnit extends ExecutionAnswerUnit{

    private final Boolean answer;
    
    public ExecutionBooleanAnswerUnit(UUID uuid, Boolean answer) {
        super(uuid);
        this.answer = answer;
    }
    
    public Boolean getAnswer(){
        return this.answer;
    }
    
    
    @Override
    public String toString(){
        return super.toString() + " - Boolean";
    }
}
