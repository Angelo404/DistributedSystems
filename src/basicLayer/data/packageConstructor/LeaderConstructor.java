package basicLayer.data.packageConstructor;

import basicLayer.data.packages.DataLeaderUnit;
import basicLayer.data.packages.DataUnit;

/**
 * Constructor class for Leader data unit.
 * @author Angelo
 */
public class LeaderConstructor extends PackageConstructor{
    
    /**
     * The constructor is not needed.
     */
    protected LeaderConstructor(){};

    /**
     * Create a new Leader data unit.
     * @return DataUnit
     */
    @Override
    public DataUnit createPackage() {
        return new DataLeaderUnit();
    }
    
}
