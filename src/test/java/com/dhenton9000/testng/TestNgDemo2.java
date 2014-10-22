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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author dhenton
 */
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class TestNgDemo2 {

    private static final Logger LOG = LoggerFactory.getLogger(TestNgDemo2.class);

    @BeforeClass
    public static void beforeClass() {
        LOG.debug("in beforeClass2");
    }

    @BeforeMethod
    public static void beforeMethod() {
        LOG.debug("in beforeMethod2");
    }

    @AfterClass
    public static void afterClass() {
        LOG.debug("in afterClass2");
    }

    @AfterMethod
    public static void afterMethod() {
        LOG.debug("in afterMethod2");
    }

    @Test(enabled = false)
    public void testIgnore() {
        LOG.debug("this test should be ignored");
    }

    @Test
    public void testSomething2() {
        LOG.debug("$$$testSomething2$$$");
        assertTrue(true);

    }

    @Test
    public void testFail2() {
        LOG.debug("$$$testFail2$$$");
        fail("get a job");
    }

    @Test
    public void testEqualityFail2() {
        LOG.debug("$$$testEqualityFail2$$$");
        assertEquals(3, 5, "get a job");
    }
}
