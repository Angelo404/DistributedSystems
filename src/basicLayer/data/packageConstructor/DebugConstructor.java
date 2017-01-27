package basicLayer.data.packageConstructor;

import basicLayer.data.packages.DataDebugUnit;
import basicLayer.data.packages.DataUnit;

/**
 * Constructor class for Debug data units.
 * @author Angelo
 */
public class DebugConstructor extends PackageConstructor{

    private static int counter = 0;
    
    /**
     * The constructor is not needed.
     */
    protected DebugConstructor(){};
    
    /**
     * Create a new Debug data unit.
     * @return DataUnit
     */
    @Override
    public DataUnit createPackage() {
        counter += 1;
        return new DataDebugUnit("DEBUG MSG", counter);
    }
    
}
