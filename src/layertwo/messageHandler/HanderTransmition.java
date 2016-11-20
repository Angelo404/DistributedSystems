/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layertwo.messageHandler;

import layertwo.data.packages.ExecutionAnswerUnit;
import layertwo.data.packages.ExecutionBooleanAnswerUnit;
import layertwo.data.packages.ExecutionDoubleAnswerUnit;
import layertwo.data.packages.ExecutionIntegerAnswerUnit;
import layertwo.data.packages.ExecutionObjectAnswerUnit;
import layertwo.data.packages.ExecutionRequestUnit;
import layertwo.data.packages.ExecutionStringAnswerUnit;
import layertwo.data.packages.ExecutionUnit;
import layertwo.data.packages.TransmitionUnit;

/**
 * Part of the Visitor pattern (visitor).
 * @author Angelo
 */
public interface HanderTransmition {
    public void execute(TransmitionUnit tUnit);
    public void execute(ExecutionUnit tUnit);
    public void execute(ExecutionAnswerUnit tUnit);
    
    public void execute(ExecutionIntegerAnswerUnit tUnit);
    public void execute(ExecutionDoubleAnswerUnit tUnit);
    public void execute(ExecutionBooleanAnswerUnit tUnit);
    public void execute(ExecutionStringAnswerUnit tUnit);
    public void execute(ExecutionObjectAnswerUnit tUnit);
    
    public void execute(ExecutionRequestUnit tUnit);
}
