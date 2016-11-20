/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.packageConstructor;

import data.packages.DataUnit;
import data.packages.DataWannabeLeaderUnit;
import messageHandler.Handler;
import messageHandler.HandlerData;

/**
 *
 * @author Angelo
 */
public class WannabeLeaderConstructor extends PackageConstructor implements Handler{
    

    protected WannabeLeaderConstructor(){};

    
    @Override
    public DataUnit createPackage() {
        return new DataWannabeLeaderUnit();
    }

    @Override
    public void accept(HandlerData handlerSwitch) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
