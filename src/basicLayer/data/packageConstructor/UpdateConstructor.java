package basicLayer.data.packageConstructor;

import basicLayer.data.packages.DataUnit;
import basicLayer.data.packages.DataUpdateUnit;

/**
 * Constructor class for Update data units.
 * @author Angelo
 */
public class UpdateConstructor extends PackageConstructor{

    /**
     * The constructor is not needed.
     */
    protected UpdateConstructor(){};
    
    /**
     * Create a new Update data unit.
     * @return DataUnit
     */
    @Override
    public DataUnit createPackage() {
        return new DataUpdateUnit();
    }
    
}
