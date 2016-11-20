/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.packageConstructor;

import data.packages.DataElectionUnit;
import data.packages.DataUnit;

/**
 *
 * @author Angelo
 */
public class ElectionConstructor extends PackageConstructor{

    protected ElectionConstructor(){};
    
    @Override
    public DataUnit createPackage() {
        return new DataElectionUnit();
    }
    
}
