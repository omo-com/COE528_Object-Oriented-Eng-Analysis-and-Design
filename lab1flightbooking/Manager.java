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
import java.util.*;


public class Manager {
    private ArrayList<Flight> flights;
    private ArrayList<Ticket> tickets;
    
    public Manager()
    {
        flights = new ArrayList<>();
        tickets = new ArrayList<>();
    }
    
    //Flights created for main method testing
    public void createFlights()
    {
        Flight f1 = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 200, 1000);
        Flight f2 = new Flight(1031, "Toronto", "Kolkata", "04/02/99 6:50 pm", 1, 1000);
        Flight f3 = new Flight(2477, "Toronto", "China", "19/12/99 6:20 pm", 200, 2000);
        flights.add(f1);
        flights.add(f2);
        flights.add(f3);
    }
    
    //Displays flgihts from a certain origin to a certain destination.
    public void displayAvailableFlights(String origin, String destination)
    {
        for(Flight element : this.flights)
        {
            if(element.getOrigin().equals(origin) && element.getDestination().equals(destination))
            {
                if(element.getNumberOfSeatsLeft()>0)
                {
                    System.out.println(element);
                }
            }
        }
        
    }
    
    //Returns flgiht of given flgiht number. If flight or flgiht number does not exist, error occurs, informing non existant flight.
    public Flight getFlight(int flightNumber)
    {
        for(Flight element : this.flights)
        {
            if(element.getFlightNumber()==flightNumber)
            {
                return element;
            }   
        }
        System.out.println("Flight does not exist.");
        return null;
       
    }
    
    //Books seat for passenger for the flight number.
    public void bookSeat(int flightNumber, Passenger p)
    {
        if(getFlight(flightNumber).bookASeat())
        {
            Ticket t = new Ticket(p,getFlight(flightNumber), getFlight(flightNumber).getOriginalPrice());
            tickets.add(t);
            System.out.println(t.toString());
            
        }
    }
    public static void main(String[] args)
    {
        Manager m1 = new Manager();
        
        //Create member and non member classes
        Member member1 = new Member("Jim", 24, 5);
        Member member2 = new Member("Sera", 32, 7);
        
        NonMember nonMember1 = new NonMember("Michael", 65);
        NonMember nonMember2 = new NonMember("Bonnie", 68);
        
        //Create built-in flights
         m1.createFlights();
         
        System.out.println("\n//Displaying Available Flights from Toronto to Kolkata.\n");
        
         //Displays the flgihts from Toronto to Kolkata. These should be flights 1030, and 1031
         m1.displayAvailableFlights("Toronto", "Kolkata");
         
         //booknig Flight with an initial capacity of 1  on flgiht 1031, also displays ticket information.
         System.out.println("\n//Member Jim, 24 years old, of 5 years membership books flight 1031.\n");
         m1.bookSeat(1031, member1);
         
         //Display Available Flights method after a flight is fully booked.
         System.out.println("\n//After Booking Flight 1031 with 1 capacity for member Jim, Display Available Flights from Toronto to Kolkata.\n");
         m1.displayAvailableFlights("Toronto", "Kolkata");
         
         //attempted booking of full flight 1031 was not possible, and no output was givevn.
         m1.bookSeat(1031, member2);
         
         //Booking flights for Flight 1030 of different members.
         System.out.println("\n//Booking Flight 1030 with member of 7 years, non member of 65 years old, and non member of 68 years old.\n");
         m1.bookSeat(1030, member2);
         m1.bookSeat(1030, nonMember1);
         m1.bookSeat(1030, nonMember2);
         
         
         System.out.println("\n//Number of Seats left of Flight 1030 after the 3 bookings.\n" + m1.getFlight(1030).getNumberOfSeatsLeft());
         
         //Display available flights for toronto to china.
         System.out.println("\n//Bookings Available for Toronto to China.\n");
         m1.displayAvailableFlights("Toronto", "China");
        
        
        
         
        
         
         
         

    }
    
    
}
