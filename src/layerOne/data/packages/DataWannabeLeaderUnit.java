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
public class DataWannabeLeaderUnit extends DataUnit{

    public DataWannabeLeaderUnit() {
        super();
    }

    @Override
    public void accept(HandlerData handlerSwitch) {
        handlerSwitch.execute(this);
    }

    @Override
    public String toString() {
        return super.toString() + " - Wannabe Leader Data Unit";
    }

}
