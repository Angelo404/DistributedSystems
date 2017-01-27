package basicLayer.data.packageConstructor;

import basicLayer.data.packages.DataDiscRespUnit;
import basicLayer.data.packages.DataUnit;

/**
 * Constructor class for Discover-Response data units.
 * @author Angelo
 */
public class DiscRespConstructor extends PackageConstructor{
    
    /**
     * The constructor is not needed.
     */
    protected DiscRespConstructor(){};

    /**
     * Create a new Discover-Response data unit.
     * @return
     */
    @Override
    public DataUnit createPackage() {
        return new DataDiscRespUnit();
    }
    
}
