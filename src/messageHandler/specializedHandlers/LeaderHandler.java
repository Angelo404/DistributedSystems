/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageHandler.specializedHandlers;

import algorithms.Algo;
import data.packageConstructor.PackageFactory;
import data.packages.DataLeaderUnit;

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
