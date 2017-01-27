package basicLayer.data.packageConstructor;

import basicLayer.data.packages.DataUnit;
import basicLayer.data.packages.DataWannabeLeaderUnit;

/**
 * Constructor class for WannabeLeader data units.
 * @author Angelo
 */
public class WannabeLeaderConstructor extends PackageConstructor{
    
    /**
     * The constructor is not needed.
     */
    protected WannabeLeaderConstructor(){};

    /**
     * Create a new WannabeLeader data unit.
     * @return DataUnit
     */
    @Override
    public DataUnit createPackage() {
        return new DataWannabeLeaderUnit();
    }    
}
