/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ice2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author praxi
 */
public class ICE2Test {
    
   
    /**
     * Test of deposit method, of class ICE2.
     */
    @Test
    public void testwithdrawGood() {
        System.out.println("withdraw good");
        double money = 500;
        ICE2 instance = new ICE2();
        boolean expResult = true;
        boolean result = instance.withdrawalofBalance(money);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testwithdrawBad() {
        System.out.println("withdraw bad");
        double money = 700;
        ICE2 instance = new ICE2();
        boolean expResult = false;
        boolean result = instance.withdrawalofBalance(money);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testwithdrawBoundry() {
        System.out.println("withdraw bo");
        double money = 600;
        ICE2 instance = new ICE2();
        boolean expResult = true;
        boolean result = instance.withdrawalofBalance(money);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testdepositGood() {
        System.out.println("deposit good");
        double money = 500;
        ICE2 instance = new ICE2();
        boolean expResult = true;
        boolean result = instance.deposit(money);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testdepositBad() {
        System.out.println("deposit bad");
        double money = 2500;
        ICE2 instance = new ICE2();
        boolean expResult = true;
        boolean result = instance.deposit(money);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testdepositBoundry() {
        System.out.println("deposit bo");
        double money = 2000;
        ICE2 instance = new ICE2();
        boolean expResult = true;
        boolean result = instance.deposit(money);
        assertEquals(expResult, result);
        
    }
    
}
