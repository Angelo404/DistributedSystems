/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import data.packageConstructor.PackageFactory;


/**
 * Factory pattern for the election algorithms
 * @author Angelo
 */
public class AlgoFactory {
    
    public static Algo createAlgo(AlgoType type, PackageFactory pckgFactory){
        Algo tmpAlgo = null;
        switch(type){
            case BULLY:
                tmpAlgo = new BullyAlgo(pckgFactory);
                break;
            default:
                break;
        }
        
        
        return tmpAlgo;
    }
    
}
