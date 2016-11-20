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
public class ExecutionIntegerAnswerUnit extends ExecutionAnswerUnit{

    private final Integer answer;
    
    public ExecutionIntegerAnswerUnit(UUID uuid, Integer answer) {
        super(uuid);
        this.answer = answer;
    }
    
    public Integer getAnswer(){
        return this.answer;
    }
    
    @Override
    public String toString(){
        return super.toString() + " - Integer";
    }
    
}
