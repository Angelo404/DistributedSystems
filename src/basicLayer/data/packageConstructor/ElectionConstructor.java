package basicLayer.data.packageConstructor;

import basicLayer.data.packages.DataElectionUnit;
import basicLayer.data.packages.DataUnit;

/**
 * Constructor class for Election data units.
 * @author Angelo
 */
public class ElectionConstructor extends PackageConstructor{

    /**
     * The constructor is not needed.
     */
    protected ElectionConstructor(){};
    
    /**
     * Create a new Election data unit.
     * @return DataUnit
     */
    @Override
    public DataUnit createPackage() {
        return new DataElectionUnit();
    }
    
}
