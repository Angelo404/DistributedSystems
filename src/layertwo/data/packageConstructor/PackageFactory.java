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
public class PackageFactory extends PackageConstructor{
    
    public PackageFactory(){
        
    }

    @Override
    protected TransmitionUnit createPackage(TransmitionTypes type) {
        TransmitionUnit tmpTransUnit = null;
        switch(type){
            case INTEGER:
                break;
            case DOUBLE:
                break;
            case BOOLEAN:
                break;
            case STRING:
                break;
            case OBJECT:
                break;
            default:
                break;
        }
        
        return tmpTransUnit;
    }
    
    
    
}
