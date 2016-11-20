/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layertwo.data.packageConstructor;

import layertwo.data.packages.TransmitionUnit;

/**
 * Factory pattern
 * @author Angelo
 */
public abstract class PackageConstructor {
    
    protected abstract TransmitionUnit createPackage(TransmitionTypes type);
}
