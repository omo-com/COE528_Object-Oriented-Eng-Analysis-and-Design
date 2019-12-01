/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1flightbooking;

import java.util.*;
/**
 *
 * @author 
 * Oliver Mo
 * 500844905
 * Fall 2019 - CCO 528
 */
public class Ticket {
    
    private Passenger passenger;
    private Flight flight;
    private double price;
    private static int number;
    
    private int count;
    private ArrayList<Flight> fNumber = new ArrayList();
    private ArrayList<Integer> tNumber = new ArrayList();
    public Ticket(Passenger p, Flight flight, double price)
    {
        this.passenger = p;
        this.flight = flight;
        this.price = this.passenger.doubleApplyDiscount(price);
        
        number++;
    }
//setter
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumber(int number) {
        this.number = number;
    }

//getter
    public Passenger getPassenger() {
        return passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public double getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }
    
    @Override
    public String toString()
    {
        String out;
        out = getPassenger().getName() + ", Flight " + flight.getFlightNumber();
        out += ", " + flight.getOrigin() + " to " + flight.getDestination();
        out += ", " + flight.getDepartureTime() + ", Ticket Number: " + getNumber()+ ", Original Price: ";
        out += flight.getOriginalPrice()+ "$, Ticket Price: " + getPrice() + "$";
        return out;
    }
}
