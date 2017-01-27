package basicLayer.daemons;

import basicLayer.algorithms.Algo;
import basicLayer.data.packageConstructor.PackageFactory;

/**
 * Factory for creating Daemons.
 * @author Angelo
 */
public class DaemonFactory {
    
    /**
     * Factory to create leader election algorithms.
     * @param type DaemonType
     * @param pckgFactory PackageFactory
     * @param algo Algo
     * @return Daemon
     */
    public static Daemon createDaemon(DaemonType type, PackageFactory pckgFactory, Algo algo){
        Daemon d = null;
        switch(type){
            case DISCOVER_DAEMON:
                d = new DiscoverDaemon(pckgFactory);
                break;
            case ELECTION_DAEMON:
                d = new ElectionDaemon(pckgFactory, algo);
                break;
            default:
                break;
        }
        return d;
    }
    
}
