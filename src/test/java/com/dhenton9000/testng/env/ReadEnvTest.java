/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhenton9000.testng.env;

import com.dhenton9000.multithread.TestBase;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.testng.Assert.assertNotNull;
import org.testng.annotations.Test;

/**
 *
 * @author dhenton
 */
public class ReadEnvTest extends TestBase {

    private static final Logger LOG = LoggerFactory.getLogger(ReadEnvTest.class);

    @Test
    public void testEnvFile() throws ConfigurationException {

        PropertiesConfiguration config = new PropertiesConfiguration("env.properties");
        assertNotNull(config);
        LOG.info("ENVIRONMENT @@@@ "+config.getString("env"));

    }

}
