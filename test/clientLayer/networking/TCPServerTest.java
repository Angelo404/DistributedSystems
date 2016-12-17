/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientLayer.networking;

import basicLayer.data.packages.DataUnit;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Euaggelos
 */
public class TCPServerTest {
    
    private TCPServer server;
    private TCPClient client;
    private Collection<DataUnit> taskQueue;
    
    public TCPServerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.server = new TCPServer(taskQueue);
        this.client = new TCPClient(taskQueue);
        server.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TCPServerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        client.start();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of run method, of class TCPServer.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        this.server.send();
    }

    
}
