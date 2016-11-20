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
public class ExecutionDoubleAnswerUnit extends ExecutionAnswerUnit{

    private final Double answer;
    
    public ExecutionDoubleAnswerUnit(UUID uuid, Double answer) {
        super(uuid);
        this.answer = answer;
    }
    
    public Double getAnswer(){
        return this.answer;
    }
    
    @Override
    public String toString(){
        return super.toString() + " - Double";
    }
    
}
