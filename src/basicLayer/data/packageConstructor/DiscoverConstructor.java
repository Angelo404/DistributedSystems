/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicLayer.data.packageConstructor;

import basicLayer.data.packages.DataDiscoverUnit;
import basicLayer.data.packages.DataUnit;

/**
 *
 * @author Angelo
 */
public class DiscoverConstructor extends PackageConstructor{

    protected DiscoverConstructor(){};
    
    @Override
    public DataUnit createPackage() {
        return new DataDiscoverUnit();
    }
    
}
