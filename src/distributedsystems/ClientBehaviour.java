/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributedsystems;

import clientLayer.data.TaskQueue;
import clientLayer.networking.TCPClient;

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
        while (isRunning) {
            System.out.println("Client Behaviour");
        }
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
    public void killPrevBehaviour() {
        isRunning = false;
        network.terminateConnection();
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
        return new ServerBehaviour();
    }
}
