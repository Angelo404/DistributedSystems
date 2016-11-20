/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layerOne.data.packages;

import layerOne.messageHandler.HandlerData;

/**
 *
 * @author Angelo
 */
public class DataDebugUnit extends DataUnit{

    private final String msg;
    private final int counter;
    
    public DataDebugUnit(String msg, int counter){
        super();
        this.msg = msg;
        this.counter = counter;
    }
    
    public String getContext(){
        return msg;
    }
    
    @Override
    public void accept(HandlerData handlerSwitch) {
        handlerSwitch.execute(this);
    }
    
    @Override
    public String toString(){
        return super.toString() + " - Debug Data Unit number - " + counter;
    }
}
