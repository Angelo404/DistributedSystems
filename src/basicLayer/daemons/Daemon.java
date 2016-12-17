/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicLayer.daemons;

import basicLayer.data.packageConstructor.PackageFactory;
import java.util.Timer;

/**
 * Factory for creating daemons.
 * @author Angelo
 */
public abstract class Daemon {

    protected final PackageFactory pckgFactory;
    protected Timer daemonTimer;
    
    public Daemon(PackageFactory pckgFactory){
        this.pckgFactory = pckgFactory;
        this.daemonTimer = new Timer();
    }
    
    public abstract void execute();
    public abstract void terminate();
    
}
