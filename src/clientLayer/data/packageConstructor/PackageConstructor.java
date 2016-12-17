/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientLayer.data.packageConstructor;

import clientLayer.data.packages.TransmitionUnit;

/**
 * Factory pattern
 * @author Angelo
 */
public abstract class PackageConstructor {
    
    protected abstract TransmitionUnit createPackage(TransmitionTypes type);
}
