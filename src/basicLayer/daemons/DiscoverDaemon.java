package basicLayer.daemons;

import basicLayer.data.packageConstructor.DataType;
import basicLayer.data.packageConstructor.PackageFactory;
import java.util.TimerTask;
import basicLayer.networking.UDPBridge;

/**
 * This is the class for the discover daemon.
 * @author Angelo
 */
public class DiscoverDaemon extends Daemon{
    
    /**
     * Constructor of discover daemon.
     * @param pckgFactory PackageFactory
     */
    public DiscoverDaemon(PackageFactory pckgFactory) {
        super(pckgFactory);
    }
    
    /**
     * Execute the daemon.
     */
    @Override
    public void execute() {
        daemonTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                UDPBridge.boradcastPackage(pckgFactory.constructPackage(DataType.DISCOVER));
            }
        }, 0, 5000); // once every minute 60 * 1000
    }

    /**
     * Terminate the daemon.
     */
    @Override
    public void terminate() {
        daemonTimer.cancel();
    }
}