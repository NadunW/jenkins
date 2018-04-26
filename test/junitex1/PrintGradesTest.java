/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package junitex1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nadunw
 */
public class PrintGradesTest {
    
    public PrintGradesTest() {
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
     * Test of print method, of class PrintGrades.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        int grade = 0;
        PrintGrades instance = new PrintGrades();
        String expResult = "Failed";
        String result = instance.print(grade);
        assertEquals(expResult, result);        
    }
    
}
