/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributedsystems;

import clientLayer.data.TaskQueue;
import clientLayer.networking.TCPClient;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angelo
 */
public class ClientBehaviour extends Behaviour implements SecondTierBehaviour {

    private TaskQueue taskQ;

    public ClientBehaviour() {
        super();
        this.taskQ = new TaskQueue();
        network = new TCPClient(this.taskQ);
    }

    @Override
    public void run() {
        // TODO introduce the main loop
//        while (isRunning) {
//            try {
//                Thread.sleep(1000);
                System.out.println("Client Behaviour");
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ClientBehaviour.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }

    public void executeComputation() {
        // TODO execute the computation you have
    }

    public void receiveComputation() {
        // TODO receive computation (replace the old one)
    }

    public void receiveParams() {
        // TODO receive new params
    }

    @Override
    public void switchBehaviour() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void assumeNewBehaviour(SecondTierBehaviour beh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void killPrevBehaviour() {
        isRunning = false;
        network.terminateConnection();
    }

    @Override
    public void assume() {
        if(isRunning){
            killPrevBehaviour();
        }
        this.start();
    }
}
