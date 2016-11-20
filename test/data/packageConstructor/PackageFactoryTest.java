/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.packageConstructor;

import data.packages.DataAckUnit;
import data.packages.DataDiscoverUnit;
import data.packages.DataLeaderUnit;
import data.packages.DataUnit;
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
public class PackageFactoryTest {
    
    PackageFactory factory;
    
    public PackageFactoryTest() {
        factory = new PackageFactory();
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
     * Test of constructPackage method, of class PackageFactory.
     */
    @Test
    public void testConstructPackage() {
        System.out.println("constructPackage");
        DataUnit tmpData = factory.constructPackage(DataType.ACK);
        assertTrue(tmpData instanceof DataAckUnit);
    }
    
    @Test
    public void testConstructPackage2() {
        System.out.println("constructPackage2");
        DataUnit tmpData = factory.constructPackage(DataType.DISCOVER);
        assertTrue(tmpData instanceof DataDiscoverUnit);
    }
    
        @Test
    public void testConstructPackage3() {
        System.out.println("constructPackage3");
        DataUnit tmpData = factory.constructPackage(DataType.LEADER);
        assertTrue(tmpData instanceof DataLeaderUnit);
    }
    
}
