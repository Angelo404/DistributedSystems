/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layerOne.data.packageConstructor;

import layerOne.data.packages.DataDiscoverUnit;
import layerOne.data.packages.DataUnit;

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
