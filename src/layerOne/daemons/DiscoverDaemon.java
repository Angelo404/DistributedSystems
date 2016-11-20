/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layerOne.daemons;

import layerOne.data.packageConstructor.DataType;
import layerOne.data.packageConstructor.PackageFactory;
import java.util.TimerTask;
import layerOne.networking.UDPBridge;

/**
 *
 * @author Angelo
 */
public class DiscoverDaemon extends Daemon{
    
    public DiscoverDaemon(PackageFactory pckgFactory) {
        super(pckgFactory);
    }
    
    @Override
    public void execute() {
        daemonTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                UDPBridge.boradcastPackage(pckgFactory.constructPackage(DataType.DISCOVER));
            }
        }, 0, 5000); // once every minute 60 * 1000
    }

    @Override
    public void terminate() {
        daemonTimer.cancel();
    }   
}