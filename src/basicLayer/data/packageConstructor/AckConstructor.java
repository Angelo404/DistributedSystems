package basicLayer.data.packageConstructor;

import basicLayer.data.packages.DataAckUnit;
import basicLayer.data.packages.DataUnit;

/**
 * Constructor class for Acknowledgment data units.
 * @author Angelo
 */
public class AckConstructor extends PackageConstructor{

    /**
     * The constructor is not needed.
     */
    protected AckConstructor(){};
    
    /**
     * Create a new Acknowledgment data unit.
     * @return DataUnit
     */
    @Override
    public DataUnit createPackage() {
        return new DataAckUnit();
    }  
}
