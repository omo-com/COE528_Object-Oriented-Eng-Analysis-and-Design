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
public class Flight {
   private int flightNumber;
   private String origin;
   private String destination;
   private String departureTime;
   private int capacity;
   private int numberOfSeatsLeft;
   private int originalPrice;

   public Flight(int fli, String ori, String des, String dep, int cap, int original)
   {
     this.flightNumber = fli;
     this.origin = ori;
     this.destination = des;
     if(this.origin.equals(this.destination))
     {
         throw new IllegalArgumentException("Origin and Destination are the same, Error.");
     }
     
     this.departureTime = dep;
     this.capacity = cap;
     this.originalPrice = original;
     this.numberOfSeatsLeft = cap;
   }
   public boolean bookASeat()
   {
       if(numberOfSeatsLeft>0)
       {
           numberOfSeatsLeft--;
           return true;
       }else
       {
           return false;
       }
       
   }
//set all instance varibles
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setNumberOfSeatsLeft(int numberOfSeatsLeft) {
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }

    public void setOriginalPrice(int originalPrice) {
        this.originalPrice = originalPrice;
    }
//get all instance variables
    public int getFlightNumber() {
        return flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfSeatsLeft() {
        return numberOfSeatsLeft;
    }

    public int getOriginalPrice() {
        return originalPrice;
    }
   /**
     * @return 
     */
   @Override
    public String toString()
    {
        String out;
        out = "Flight " + Integer.toString(flightNumber);
        out += ", " + origin + " to " + destination;
        out += ", " + departureTime + ", original price: ";
        out += Integer.toString(originalPrice)+ "$";
        return out;
    }
    
}
