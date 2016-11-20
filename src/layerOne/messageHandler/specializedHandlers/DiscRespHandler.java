/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layerOne.messageHandler.specializedHandlers;

import layerOne.data.packageConstructor.PackageFactory;
import layerOne.data.packages.DataDiscRespUnit;

/**
 *
 * @author Angelo
 */
public class DiscRespHandler extends SpecializedHandler{
    // TODO nothing???
    public DiscRespHandler(PackageFactory pckgFactory){
        super(pckgFactory);
    }
    
    public void handleData(DataDiscRespUnit data, PackageFactory pckgFactory){
    
    }

}
