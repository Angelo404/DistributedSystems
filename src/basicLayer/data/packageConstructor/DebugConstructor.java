/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicLayer.data.packageConstructor;

import basicLayer.data.packages.DataDebugUnit;
import basicLayer.data.packages.DataUnit;

/**
 *
 * @author Angelo
 */
public class DebugConstructor extends PackageConstructor{

    private static int counter = 0;
    
    protected DebugConstructor(){};
    
    @Override
    public DataUnit createPackage() {
        counter += 1;
        return new DataDebugUnit("DEBUG MSG", counter);
    }
    
}
