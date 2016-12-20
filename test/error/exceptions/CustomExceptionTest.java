/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package error.exceptions;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Angelo
 */
public class CustomExceptionTest {
    
    public CustomExceptionTest() {
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
     * Test of showCustomMessage method, of class FewParametersCustEx.
     */
    @Test
    public void test1() {
        System.out.println("Testing...");
        
        try{
            throw new FewParametersCustEx(this.getClass().getName());
        }catch(FewParametersCustEx ex){
            System.out.println(ex);
            ex.showCustomMessage();
        }
        
        try{
            throw new NullSocketOnClose(this.getClass().getName());
        }catch(NullSocketOnClose ex){
            System.err.println(ex);
            ex.showCustomMessage();
        }
        
        try{
            throw new NullStreamOnCloseCustEx(this.getClass().getName());
        }catch(NullStreamOnCloseCustEx ex){
            System.out.println(ex);
            ex.showCustomMessage();
        }
    }
    
}
