/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.packageConstructor;

import data.packages.DataUnit;
import data.packages.DataUpdateUnit;

/**
 *
 * @author Angelo
 */
public class UpdateConstructor extends PackageConstructor{

    protected UpdateConstructor(){};
    
    @Override
    public DataUnit createPackage() {
        return new DataUpdateUnit();
    }
    
}
