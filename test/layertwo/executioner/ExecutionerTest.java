/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layertwo.executioner;

import java.util.List;
import java.util.concurrent.Callable;
import layertwo.tasks.Addition;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Euaggelos
 */
public class ExecutionerTest {
    
    public ExecutionerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of execute method, of class Executioner.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        Callable v = new Addition(5,5,5,5);
        Executioner instance = new Executioner();
        instance.execute(v);
    }
    
}
