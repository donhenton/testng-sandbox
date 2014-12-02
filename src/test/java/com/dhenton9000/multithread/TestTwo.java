/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhenton9000.multithread;

import com.dhenton9000.testng.TestNgDemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 * @author dhenton
 */
public class TestTwo extends TestBase {

    private static final Logger LOG = LoggerFactory.getLogger(TestTwo.class);

    @BeforeClass
    public void beforeClass() {
        report(LOG, "in beforeClass");
    }

    @BeforeTest
    public void beforeTest() {
        report(LOG, "-----in beforeTest-----");
    }

    @AfterTest
    public void afterTest() {
        report(LOG, "----in afterTest----");
    }

    @BeforeMethod
    public void beforeMethod() {
        report(LOG, "in beforeMethod");
    }

    @AfterClass
    public void afterClass() {
        report(LOG, "in afterClass");
    }

    @AfterMethod
    public void afterMethod() {
        report(LOG, "in afterMethod");
    }

    @Test
    public void testA() {
        report(LOG, "@@@testA@@@");
        assertTrue(true);

    }

    @Test
    public void testB() {
        report(LOG, "@@@testB@@@");
        assertTrue(true);

    }

    @Test
    public void testC() {
        report(LOG, "@@@testC@@@");
        assertTrue(true);

    }

}
