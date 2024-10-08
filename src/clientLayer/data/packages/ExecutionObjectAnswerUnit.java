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
public class ExecutionObjectAnswerUnit extends ExecutionAnswerUnit{

    private final Object answer;
    
    public ExecutionObjectAnswerUnit(UUID uuid, Object answer) {
        super(uuid);
        this.answer = answer;
    }
    
    public Object getAnswer(){
        return this.answer;
    }
    
    @Override
    public String toString(){
        return super.toString() + " - Object";
    }
    
}
