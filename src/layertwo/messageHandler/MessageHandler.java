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
