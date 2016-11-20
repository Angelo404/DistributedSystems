/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.logs;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.Parser;

/**
 *
 * @author Angelo
 */
public class ClientMapTest {

    private final ClientMap instance;
    private String host2;
    private String host1;
    
    public ClientMapTest() {
        instance = ClientMap.getInstance();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
            host1 = "192.168.1.1";
            host2 = "127.0.0.1";
            instance.replace(host1, 0);
            instance.remove(host2);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addHost method, of class ClientMap.
     */
    @Test
    public void testAddHost_String() {
        System.out.println("addHost");

        instance.addHost(host1);
        assertEquals(instance.getCounter(host1), Integer.valueOf(1));
    }

    /**
     * Test of increaseHost method, of class ClientMap.
     */
    @Test
    public void testIncreaseHost_String() {
        System.out.println("increaseHost");
        
        instance.addHost(host1);
        instance.increaseHost(host1);
        
        assertEquals(instance.getCounter(host1), Integer.valueOf(2));
    }

    /**
     * Test of setLeader method, of class ClientMap.
     */
    @Test
    public void testSetLeader_String() {
        System.out.println("setLeader");
        
        instance.setLeader("88.88.88.88");
        
        assertEquals(instance.getLeaderIp(), Parser.strToInet("88.88.88.88"));
    }

    /**
     * Test of getCounter method, of class ClientMap.
     */
    @Test
    public void testGetCounter_String() {
        System.out.println("getCounter");

        instance.addHost(host1);
        instance.increaseHost(host1);
        assertEquals(instance.getCounter(host1), Integer.valueOf(2));
    }

    @Test
    public void testReplaceHigher(){
        System.out.println("replaceHigher");
        
        instance.addHost(host1);
        instance.addHost(host2);
        
        HashMap tmpHash = new HashMap<InetAddress, Integer>();
        try {
            tmpHash.put(InetAddress.getByName(host1), 88);
        } catch (UnknownHostException ex) {
            Logger.getLogger(ClientMapTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        instance.replaceHigher(tmpHash);
        
        System.out.println(instance.toString());
        System.out.println(tmpHash.toString());
    }
}
