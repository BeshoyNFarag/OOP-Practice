/*
Write a Java program to create a class with methods to search for flights and hotels,
and to book and cancel reservations.
*/

import java.util.Iterator;

public class BookingSystem {
    DataStorage data;

    public BookingSystem(DataStorage data){
        this.data = data;
    }

    public void searchFlight(String flight){
        boolean found = false;

        for (String f : data.flights){
            if (f.equalsIgnoreCase(flight)){
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(flight + " Was found");
        else
            System.out.println(flight + " Was NOT found");
    }
}
