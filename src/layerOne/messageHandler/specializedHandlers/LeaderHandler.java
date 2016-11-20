/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layerOne.messageHandler.specializedHandlers;

import layerOne.algorithms.Algo;
import layerOne.data.packageConstructor.PackageFactory;
import layerOne.data.packages.DataLeaderUnit;

/**
 *
 * @author Angelo
 */
public class LeaderHandler extends SpecializedHandler{
    
    public LeaderHandler(PackageFactory pckgFactory){
        super(pckgFactory);
    }

    public void handleData(DataLeaderUnit data, Algo algo) {
        algo.handleData(data); 
    }
}
