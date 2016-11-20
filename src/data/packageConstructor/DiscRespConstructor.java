/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.packageConstructor;

import data.packages.DataDiscRespUnit;
import data.packages.DataUnit;

/**
 *
 * @author Angelo
 */
public class DiscRespConstructor extends PackageConstructor{
    
    protected DiscRespConstructor(){};

    @Override
    public DataUnit createPackage() {
        return new DataDiscRespUnit();
    }
    
}
