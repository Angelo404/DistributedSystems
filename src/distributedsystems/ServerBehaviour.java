/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributedsystems;

import clientLayer.networking.TCPServer;

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
        System.err.println("is this being printed");
        while (isRunning) {
            System.out.println("Server Behaviour");
        }
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
    public void killPrevBehaviour() {
        isRunning = false;
        network.terminateConnection();
        this.interrupt();
    }

    @Override
    public void assume() {
        if (isRunning) {
            killPrevBehaviour();
        }
        isRunning = true;
        this.start();
    }

    @Override
    public SecondTierBehaviour switchBehaviour() {
        return new ClientBehaviour();
    }

}
