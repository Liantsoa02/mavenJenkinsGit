/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenprojectjenkins;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usager
 */
public class ClasseMainTest {
    
    public ClasseMainTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addition method, of class ClasseMain.
     */
    @Test
    public void testAddition() {
        System.out.println("addition");
        double a = 0.0;
        double expResult = 0.0;
        double result = ClasseMain.addition(a);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of multiplier method, of class ClasseMain.
     */
    @Test
    public void testMultiplier() {
        System.out.println("multiplier");
        double a = 0.0;
        double expResult = 0.0;
        double result = ClasseMain.multiplier(a);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
