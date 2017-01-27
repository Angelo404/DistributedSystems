package basicLayer.algorithms;

import basicLayer.data.packageConstructor.PackageFactory;


/**
 * Factory pattern for the election algorithms.
 * @author Angelo
 */
public class AlgoFactory {
    
    /**
     * Factory to create leader election algorithms.
     * @param type AlgoType
     * @param pckgFactory PackageFactory
     * @return AlgoType
     */
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
