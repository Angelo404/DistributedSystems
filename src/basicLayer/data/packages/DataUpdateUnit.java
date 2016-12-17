/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicLayer.data.packages;

import basicLayer.messageHandler.HandlerData;

/**
 *
 * @author Angelo
 */
public class DataUpdateUnit extends DataUnit{
        
    public DataUpdateUnit() {
        super();
    }

    @Override
    public void accept(HandlerData handlerSwitch) {
        handlerSwitch.execute(this);
    }
    
    @Override
    public String toString(){
        return super.toString() + " - Data Upadate Data Unit";
    }
}