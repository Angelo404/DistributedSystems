/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layerOne.daemons;

import layerOne.algorithms.Algo;
import layerOne.data.packageConstructor.PackageFactory;
import java.util.TimerTask;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angelo
 */
public class ElectionDaemon extends Daemon{

    private final Algo algo;

    public ElectionDaemon(PackageFactory pckgFactory, Algo algo) {
        super(pckgFactory);
        this.algo = algo;
    }

    @Override
    public void execute() {
        daemonTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<String> future = executor.submit(algo);
                try {
                    System.err.println(future.get());
                } catch (InterruptedException | ExecutionException ex) {
                    future.cancel(true);
                    Logger.getLogger(ElectionDaemon.class.getName()).log(Level.SEVERE, null, ex);
                }
                executor.shutdownNow();
            }
        }, 0, 10000); // once every minute 60 * 1000
    }

    @Override
    public void terminate() {
        daemonTimer.cancel();
    }
    
}
