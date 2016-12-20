/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributedsystems;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Angelo
 */
public class SecondTierNodeTest {

    private SecondTierNode instance;
    
    public SecondTierNodeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new SecondTierNode();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setBehaviour method, of class SecondTierNode.
     */
    @Test
    public void testSetBehaviour() {
        System.out.println("setBehaviour");
//        instance.setBehaviour(new ServerBehaviour());
//        instance.assumeBehaviour();
//        instance.setBehaviour(new ClientBehaviour());
//        instance.assumeBehaviour();
//        instance.setBehaviour(new ServerBehaviour());
//        instance.assumeBehaviour();
//        instance.killBehaviour();
    }
    
    @Test
    public void switchingBehaviour(){
        System.err.println("switchBehaviour");
        instance.setBehaviour(new ServerBehaviour());
        instance.assumeBehaviour();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SecondTierNodeTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        instance.switchBehaviour();
        instance.assumeBehaviour();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SecondTierNodeTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        instance.killBehaviour();
    }
}
