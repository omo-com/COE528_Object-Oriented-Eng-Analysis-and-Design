/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1flightbooking;


/**
 *
 * @author 
 * Oliver Mo
 * 500844905
 * Fall 2019 - COE 528
 */
public class NonMember extends Passenger{
    public NonMember(String name, int age)
    {
        super(name, age);
    }
    @Override
    public double doubleApplyDiscount(double p)
    {
        if(super.getAge() > 65)
        {
            p = p*0.9;
        }
        else if (super.getAge() >=0)
        {
            p = p*1;
        }
        return p;
    }
            
    
}
