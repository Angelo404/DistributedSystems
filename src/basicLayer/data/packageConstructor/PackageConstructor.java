/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicLayer.data.packageConstructor;

import basicLayer.data.packages.DataUnit;

/**
 * Factory pattern
 * @author Angelo
 */
public abstract class PackageConstructor {
    
    public abstract DataUnit createPackage();
    
}
