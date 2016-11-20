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
public class DataAckUnit extends DataUnit{

    public DataAckUnit() {
        super();
    }

    @Override
    public void accept(HandlerData handlerSwitch) {
        handlerSwitch.execute(this);
    }

    @Override
    public String toString() {
        return super.toString() + " - Acknoledgment Data Unit";
    }

}
