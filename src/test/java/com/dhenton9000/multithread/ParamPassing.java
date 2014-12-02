/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhenton9000.multithread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 *
 * @author dhenton
 */
public class ParamPassing extends TestBase {

    private static final Logger LOG = LoggerFactory.getLogger(ParamPassing.class);

    @BeforeClass
    public void beforeClass() {
         LOG.debug("in beforeClass of "+this.getClass().getName());
    }

    @BeforeMethod
    public void beforeMethod() {

    }

    @AfterClass
    public void afterClass() {

    }

    @AfterMethod
    public void afterMethod() {

    }

    /**
     * passed in the testng xml script
     * @param alpha
     * @param beta
     * @param gamma 
     */
    @Parameters({ "alpha", "beta" ,"gamma"})
    
    @Test
    public void testParamsSucceed(String alpha, int beta, String gamma) {
        LOG.debug("in test A of "+this.getClass().getName());
         assertEquals("alpha", alpha);
         assertEquals(5, beta);
         assertEquals("gamma", gamma);

    }

}
