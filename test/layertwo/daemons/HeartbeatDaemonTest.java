/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layertwo.daemons;

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
public class HeartbeatDaemonTest {
    
    HeartbeatDaemon hbd;
    
    public HeartbeatDaemonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        hbd = new HeartbeatDaemon(true);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of execute method, of class HeartbeatDaemon.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        hbd.execute();
        System.out.println(hbd.getAlive());
        try {
            Thread.sleep(6000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HeartbeatDaemonTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(hbd.getAlive());
    }


    
}
