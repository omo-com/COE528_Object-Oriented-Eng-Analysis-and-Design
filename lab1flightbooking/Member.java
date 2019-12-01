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
 * Fall 2019 - COE 528 - 09
 */
public class Member extends Passenger {
    private int yearsOfMembership;
    public Member(String name,int age, int years)
    {
     super(name,age); 
     this.yearsOfMembership = years;
    
    }
    @Override
    public double doubleApplyDiscount(double p)
    {
        if(this.yearsOfMembership > 5)
        {
            p = p*0.5;
        }
        else if(this.yearsOfMembership >= 1)
        {
            p  = p*0.9;
        }
        else
        {
            p = p*1;
        }
        return p;
    }    
}
