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
 *
 * @author Angelo
 */
public class MessageHandler implements HanderTransmition{
    
    public MessageHandler(){
        
    }

    @Override
    public void execute(TransmitionUnit tUnit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void execute(ExecutionUnit tUnit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void execute(ExecutionAnswerUnit tUnit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void execute(ExecutionIntegerAnswerUnit tUnit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void execute(ExecutionDoubleAnswerUnit tUnit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void execute(ExecutionBooleanAnswerUnit tUnit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void execute(ExecutionStringAnswerUnit tUnit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void execute(ExecutionObjectAnswerUnit tUnit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void execute(ExecutionRequestUnit tUnit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
