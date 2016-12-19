/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientLayer.networking;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.InitializerTimer;

/**
 *
 * @author Angelo
 */
public class TCPServer extends TCPBridge {

    private ServerSocket socket;
    private Socket connectionSocket;

    public TCPServer() {
        super();
        createSocket();

    }

    private void createSocket() {
        try {
            socket = new ServerSocket(port);
        } catch (IOException ex) {
            Logger.getLogger(TCPBridge.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        try {
            connectionSocket = socket.accept();
            System.err.println(connectionSocket.toString());
        } catch (IOException ex) {
            Logger.getLogger(TCPBridge.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void send() {
        while (true) {
            try {
                ObjectOutputStream objectOutput = new ObjectOutputStream(connectionSocket.getOutputStream());
                objectOutput.writeObject(new String("This is sent"));
            } catch (IOException ex) {
                System.out.println("This is the error");
                Logger.getLogger(TCPServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public void terminateConnection() {       
        super.terminateConnection();
        InitializerTimer.execute("Terminating Server...", 200);
        try {
            socket.close();
            connectionSocket.close();
        } catch (SocketException ex) {
            Logger.getLogger(TCPServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TCPServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex){
            System.err.println("This should only occur if the netwrok interface has never started."
                    + " It is caused because the input stream has not been created"
                    + "since the network bridge has not received anything yet.");
        }
    }
}