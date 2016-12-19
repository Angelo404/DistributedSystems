/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributedsystems;

import clientLayer.networking.TCPServer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angelo
 */
public class ServerBehaviour extends Behaviour implements SecondTierBehaviour {

    public ServerBehaviour() {
        super();
        network = new TCPServer();
    }

    @Override
    public void run() {
        // TODO introduce the main loop
//        while (isRunning) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ServerBehaviour.class.getName()).log(Level.SEVERE, null, ex);
//            }
            System.out.println("Server Behaviour");
//        }
    }

    public void locateIdleClients() {
        // TODO return all clients that are idle
    }

    public void countIdleClients() {
        // TODO return the number of clients that are idle
    }

    public void sendComputation() {
        // TODO send computation to the next available client
    }

    public void receiveComputation() {
        // TODO act when you get something back
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
