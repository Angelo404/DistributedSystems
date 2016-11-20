/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageHandler.specializedHandlers;

import data.packageConstructor.PackageFactory;
import data.packages.DataUpdateUnit;

/**
 *
 * @author Angelo
 */
public class UpdateHandler extends SpecializedHandler{
    
    public UpdateHandler(PackageFactory pckgFactory){
        super(pckgFactory);
    }
    
    public void handleData(DataUpdateUnit data){
        System.out.println(data); // TODO implement
    }

}
