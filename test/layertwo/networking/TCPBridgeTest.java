/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layertwo.networking;

import clientLayer.networking.TCPBridge;
import clientLayer.data.TaskQueue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Euaggelos
 */
public class TCPBridgeTest {
    private Thread thread1;
    private Thread thread2;
    private TaskQueue taskQueue;
    
    public TCPBridgeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        thread1 = new TCPBridge(taskQueue);
        thread2 = new TCPBridge(taskQueue);
        thread1.start();
        thread2.start();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of run method, of class TCPBridge.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        
    }
    
}
