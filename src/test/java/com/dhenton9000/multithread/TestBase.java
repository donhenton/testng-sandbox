/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhenton9000.multithread;
import org.slf4j.Logger;
/**
 *
 * @author dhenton
 */
public class TestBase {
    
    public void report(Logger logger, String info)
    {
        long threadId = Thread.currentThread().getId();
        logger.debug(info +" ["+this.getClass().getName()+" ] (thread "+threadId+")");
    }
}
