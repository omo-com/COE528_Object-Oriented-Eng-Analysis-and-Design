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
public abstract class Passenger {

    
    private String name;
    private int age;

    public Passenger(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public abstract double doubleApplyDiscount(double p);
   
//setter methods 
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
//getter methods  
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
