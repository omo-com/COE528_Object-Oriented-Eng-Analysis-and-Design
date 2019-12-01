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
import java.util.*;
public class Odometer implements Counter{
    
    //Instance Varibles
    private DigitCounter dc;
    private ArrayList <LinkedDigitCounter> ldc = new ArrayList();
    public Odometer(int n)
    {
        if(n == 1)//Single digit odometer, creat only DigitCounter
        {
            this.dc = new DigitCounter();
        }
        else if(n>1)//Multiple digits, create Digitcount b3fore loop for linkeddigitcounter.
        {
            this.dc = new DigitCounter();
            this.ldc.add(new LinkedDigitCounter(this.dc));
            if(n>2)
                {
                    for(int i = 2; i<n ;i++)
                    {
                          this.ldc.add(new LinkedDigitCounter(this.ldc.get(i-2)));    
                    }
                }
        }
        else//Throw error for when 0, or less is inputed into odometer.
        {
            throw new IllegalArgumentException("Number of digits in odometer must be atleast 1");
        }
    }
    
    @Override
    public String count()
    {
        String out = dc.count();
        for(LinkedDigitCounter element : this.ldc)
        {
            out+= element.count();
        }
        return out;
    }
  
    @Override
    public void reset()
    {
        dc.reset();
        for(LinkedDigitCounter element : this.ldc)
        {
            element.reset();
        }
    }
    @Override
    public void increment()
    {
        if(!this.ldc.isEmpty())
        {
            this.ldc.get(this.ldc.size()-1).increment();
        }
        else
        {
            this.dc.increment();  
        }
    }
    @Override
    public void decrement()
    {
         if(!this.ldc.isEmpty())
        {
            this.ldc.get(this.ldc.size()-1).decrement();
        }
        else
        {
            this.dc.decrement();  
        }
    }
    
}
