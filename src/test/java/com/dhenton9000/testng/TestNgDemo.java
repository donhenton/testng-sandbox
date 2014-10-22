/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhenton9000.testng;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 *
 * @author dhenton
 */
public class TestNgDemo {
    
    private Logger LOG = LoggerFactory.getLogger(TestNgDemo.class);
    
    @Test
    public void testSomething()
    {
        LOG.debug("testsomething");
        assertTrue(true);
        
    }
    
    
}
