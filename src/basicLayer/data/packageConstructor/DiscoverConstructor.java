package basicLayer.data.packageConstructor;

import basicLayer.data.packages.DataDiscoverUnit;
import basicLayer.data.packages.DataUnit;

/**
 * Constructor class for Discover data units.
 * @author Angelo
 */
public class DiscoverConstructor extends PackageConstructor{

    /**
     * The constructor is not needed.
     */
    protected DiscoverConstructor(){};
    
    /**
     * Create a new Discover data unit.
     * @return DataUnit
     */
    @Override
    public DataUnit createPackage() {
        return new DataDiscoverUnit();
    }
    
}
