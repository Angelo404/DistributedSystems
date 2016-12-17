/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicLayer.data.packageConstructor;

import basicLayer.data.packages.DataAckUnit;
import basicLayer.data.packages.DataUnit;

/**
 *
 * @author Angelo
 */
public class AckConstructor extends PackageConstructor{

    protected AckConstructor(){};
    
    @Override
    public DataUnit createPackage() {
        return new DataAckUnit();
    }  
}
