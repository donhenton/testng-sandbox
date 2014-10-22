/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhenton9000.testng;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;

 

/**
 * http://testng.org/doc/documentation-main.html#running-testng-programmatically
 *
 * @author dhenton
 */
public class TestNgLauncher {

    private static final Logger LOG = LoggerFactory.getLogger(TestNgLauncher.class);

    public static void main(String[] args) {

        TestListenerAdapter tla = new TestListenerAdapter();
        TestNG testng = new TestNG();
        testng.setDataProviderThreadCount(1);
        
        testng.setTestClasses(new Class[]{TestNgDemo.class,TestNgDemo2.class});
        testng.addListener(tla);
        testng.run();
        List<ITestResult> failedTests = tla.getFailedTests();
        if (failedTests != null && failedTests.size() > 0)
        {
            for (ITestResult result: failedTests)
            {
                
                LOG.warn(String.format("failed test name  [%s]: '%s'",
                        result.getMethod().getMethodName(),
                        result.getThrowable().getMessage()));
            }
        }
        else
        {
            LOG.info("No failed tests");
        }

    }

}
