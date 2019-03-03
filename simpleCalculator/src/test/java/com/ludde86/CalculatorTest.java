/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ludde86;

import com.ludde86.simplecalculator.Calculator;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Ludde
 */
public class CalculatorTest {
    
    Calculator calculator = new Calculator();
    
    @Test
    public void addTest() {
        Assert.assertEquals(10, calculator.add(2, 8));
    }
    
    @Test
    public void subtractTest() {
        Assert.assertEquals(2, calculator.subtract(10, 8));
    }
    
    @Test
    public void divideTest() {
        Assert.assertEquals(5, calculator.divide(10, 2));
    }
    
    @Test
    public void multiply() {
        Assert.assertEquals(12, calculator.multiply(3,4));
    }
    
}
