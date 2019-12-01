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


public class LinkedDigitCounter extends AbstractCounter{
    
    
    private Counter leftNeighbour;//creating left neightbout counter varible.
    
    public LinkedDigitCounter(Counter left){
    super();
    this.leftNeighbour = left;
    }
    
    @Override
    public String count()//call abstract counter's count method.
    {
        return super.count();
    }
    @Override
    public void reset()//call reset method.
    {
        super.reset();
    }
    @Override
    public void increment()//if Value increases from 9 to 0, increase left neighbour by 1.
    {
        super.increment();
        if(Integer.parseInt(super.count())==0)
        {
            this.leftNeighbour.increment();
        }
    }
    
    @Override
    public void decrement()//Performs decrement, if the value goes from 0 to 9, decrement leftneighbout.
    {
        super.decrement();
        if(Integer.parseInt(super.count())==9)
        {
            this.leftNeighbour.decrement();
        }
    }
    
   
}
