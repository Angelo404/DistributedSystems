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
import static org.junit.Assert.*;

/**
 *
 * @author Euaggelos
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
        instance.setBehaviour(new ServerBehaviour());
        instance.assumeBehaviour();
        instance.setBehaviour(new ClientBehaviour());
        instance.assumeBehaviour();
        instance.setBehaviour(new ServerBehaviour());
        instance.assumeBehaviour();
        instance.setBehaviour(new ClientBehaviour());
        instance.assumeBehaviour();
        instance.setBehaviour(new ServerBehaviour());
        instance.assumeBehaviour();
        instance.setBehaviour(new ClientBehaviour());
        instance.assumeBehaviour();
        instance.setBehaviour(new ServerBehaviour());
        instance.assumeBehaviour();
        instance.setBehaviour(new ClientBehaviour());
        instance.assumeBehaviour();
    }
    
}
