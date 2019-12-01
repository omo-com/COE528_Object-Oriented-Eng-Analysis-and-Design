/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab3;

/**
 *
 * @author
 * Oliver Mo
 * 500844905
 * COE 528 - 09
 */

public abstract class AbstractCounter implements Counter{
    
    private int value = 0;
    
    public AbstractCounter()
    {
       
    }
    @Override
    public String count()
    {
        return Integer.toString(this.value);
    }
    @Override
    public void reset()
    {
        this.value = 0;
    }
    @Override
    public void increment()
    {
        if(this.value<9)
        {
            this.value++;
        }
        else{
            this.value = 0;
        }
    }
    
    @Override
    public void decrement()
    {
        if(value>0)
        {
            value--;
        }
        else{
            value = 9;
        }
    }
    
    
    
}
