/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageHandler.specializedHandlers;

import data.packageConstructor.PackageFactory;
import data.packages.DataAckUnit;

/**
 *
 * @author Angelo
 */
public class AckHandler extends SpecializedHandler {
    
    public AckHandler(PackageFactory pckgFactory){
        super(pckgFactory);
    }

    public void handleData(DataAckUnit data) {

    }
}
