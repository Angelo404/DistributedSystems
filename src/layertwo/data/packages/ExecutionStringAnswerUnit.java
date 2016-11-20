/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layertwo.data.packages;

import java.util.UUID;

/**
 *
 * @author Angelo
 */
public class ExecutionStringAnswerUnit extends ExecutionAnswerUnit{

    private final String answer;
    
    public ExecutionStringAnswerUnit(UUID uuid, String answer) {
        super(uuid);
        this.answer = answer;
    }
    
    public String getAnswer(){
        return this.answer;
    }
    
    @Override
    public String toString(){
        return super.toString() + " - String";
    }
    
}
