/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientLayer.messageHandler;

import clientLayer.data.packages.ExecutionAnswerUnit;
import clientLayer.data.packages.ExecutionBooleanAnswerUnit;
import clientLayer.data.packages.ExecutionDoubleAnswerUnit;
import clientLayer.data.packages.ExecutionIntegerAnswerUnit;
import clientLayer.data.packages.ExecutionObjectAnswerUnit;
import clientLayer.data.packages.ExecutionRequestUnit;
import clientLayer.data.packages.ExecutionStringAnswerUnit;
import clientLayer.data.packages.ExecutionUnit;
import clientLayer.data.packages.TransmitionUnit;

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
