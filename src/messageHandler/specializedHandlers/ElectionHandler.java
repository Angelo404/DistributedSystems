/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageHandler.specializedHandlers;

import algorithms.Algo;
import data.packageConstructor.PackageFactory;
import data.packages.DataElectionUnit;

/**
 *
 * @author Angelo
 */
public class ElectionHandler extends SpecializedHandler{
    
    public ElectionHandler(PackageFactory pckgFactory){
        super(pckgFactory);
    }
    
    // TODO if you hear from someone higher shut up

    public void handleData(DataElectionUnit data, Algo algo) {
        algo.handleData(data);
    }
}
