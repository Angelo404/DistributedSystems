/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layertwo.data;

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
public class TupleTest {
    
    private Tuple tuple1;
    private Tuple tuple2;
    
    public TupleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        tuple1 = new Tuple(100,1);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        System.out.println(tuple1.getx());
    }
    
}
