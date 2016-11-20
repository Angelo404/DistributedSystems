/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layertwo.messageHandler;

/**
 * Part of the Visitor pattern (Visitable)
 * @author Angelo
 */
public interface Handler {
    
    public abstract void accept(HanderTransmition handlerSwitch);
    
}
