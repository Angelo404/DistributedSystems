/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientLayer.networking;

import clientLayer.data.TaskQueue;
import clientLayer.tasks.Task;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.InitializerTimer;

/**
 *
 * @author Angelo
 */
public class TCPClient extends TCPBridge {

    private Socket socket;
    private final TaskQueue taskQueue;
    private ObjectInputStream objectInput;

    public TCPClient(TaskQueue taskQueue) {
        super();
        this.taskQueue = taskQueue;
        this.running = true;
        this.objectInput = null;
    }

    @Override
    public void run() {
        try {
            socket = new Socket("localhost", port);
        } catch (IOException ex) {
            Logger.getLogger(TCPClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        receiveData();
    }

    private void receiveData() {
        while (running) {
            try {
                objectInput = new ObjectInputStream(socket.getInputStream());
                addToQueue((String) objectInput.readObject());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TCPClient.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SocketException ex) {
                System.out.println("Exiting with exception");
            } catch (IOException ex) {
                Logger.getLogger(TCPClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void addToQueue(String task) {
        taskQueue.add(task);
    }

    private void addToQueue(Task task) {

    }

    private void addToQueue(Object obj) {
        // This is a place holder for now
    }

    @Override
    public void terminateConnection() {
        super.terminateConnection();
        InitializerTimer.execute("Terminating Client...", 200);
        try {
            objectInput.close();
            socket.close();
        } catch (NullPointerException ex){
            System.err.println("This should only occur if the netwrok interface has never started."
                    + " It is caused because the input stream has not been created"
                    + "since the network bridge has not received anything yet.");
        } catch (IOException ex) {
            Logger.getLogger(TCPClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
