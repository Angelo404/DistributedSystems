/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layerOne.daemons;

import layerOne.algorithms.Algo;
import layerOne.data.packageConstructor.PackageFactory;

/**
 * Factory for creating Daemons.
 * @author Angelo
 */
public class DaemonFactory {
    
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
