/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.packages;


import messageHandler.HandlerData;

/**
 *
 * @author Angelo
 */
public class DataDiscoverUnit extends DataUnit{
        
    public DataDiscoverUnit() {
        super();
    }
    
    @Override
    public void accept(HandlerData handlerSwitch) {
        handlerSwitch.execute(this);
    }
    
    @Override
    public String toString(){
        return super.toString() + " - Data Discover Data Unit";
    }
    
}
