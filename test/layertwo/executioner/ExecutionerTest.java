/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layertwo.executioner;

import clientLayer.executioner.Executioner;
import java.util.concurrent.Callable;
import clientLayer.tasks.NumericalTask;
import clientLayer.tasks.Params;
import clientLayer.tasks.Addition;
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
        NumericalTask a = new Addition();
        a.giveParams(new Params(1.0,2.0,3.0,4.0,5.0));
        Executioner instance = new Executioner();
        instance.execute(a);
    }
    
}
