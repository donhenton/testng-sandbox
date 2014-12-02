/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhenton9000.multithread;

/**
 *
 * @author dhenton
 */
class CounterContainer {

    private int count = 0;
    
    public void increment()
    {
        count ++;
    }
    
    public int getCount()
    {
        return count;
    }
    
    public CounterContainer(int initial) {
    }
    
}
