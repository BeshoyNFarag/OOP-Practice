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

    public boolean searchFlight(String flight){
        boolean found = false;

        for (String f : data.flights){
            if (f.equalsIgnoreCase(flight)){
                found = true;
                break;
            }
        }

        if(found)
            return true;
        else
            return false;
    }

    public boolean searchHotel(String hotel){
        boolean found = false;
        for(String h : data.hotels){
            if(hotel.equalsIgnoreCase(h)){
                found = true;
                break;
            }
        }

        if(found){
            return true;
        }
        else
            return false;


    }

    public void bookFlight(String flight){
        if (searchFlight(flight)){
            System.out.println(flight + " is now booked for you");
            data.flightCart.add(flight);
        }
        else
            System.out.println(flight + " is non existent of fully booked");
    }
    public void bookHotel(String hotel){
        if (searchHotel(hotel)){
            System.out.println(hotel + " is now booked for you");
            data.hotelCart.add(hotel);
        }
        else
            System.out.println(hotel + " is non existent of fully booked");
    }

    public void cancelHotel(String hotel){
        if (data.flightCart.contains(hotel)){
            System.out.println("Your reservation for " + hotel + " has been cancelled");
            data.flightCart.remove(hotel);
        }
        else
            System.out.println("you dont have this reservation");
    }

    public void cancelFlight(String flight){
        if (data.flightCart.contains(flight)){
            System.out.println("Your reservation for " + flight + " has been cancelled");
            data.flightCart.remove(flight);
        }
        else
            System.out.println("you dont have this reservation");
    }

}
