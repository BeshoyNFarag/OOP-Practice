/*
Write a Java program to create a class with methods to search for flights and hotels,
and to book and cancel reservations.
*/

import java.util.ArrayList;

public class DataStorage {


    ArrayList<String> hotels = new ArrayList<>();
    ArrayList<String> flights = new ArrayList<>();
    ArrayList<String> hotelCart = new ArrayList<>();
    ArrayList<String> flightCart = new ArrayList<>();

  public void addHotel(String hotel){
      hotels.add(hotel);

  }

  public void addFlight(String flight){
      flights.add(flight);
  }


}
