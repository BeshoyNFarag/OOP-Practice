/*
12. Write a Java program to create a class called "Airplane" with a flight number, destination,
and departure time attributes, and methods to check flight status and delay.

**/


import java.time.LocalTime;

public class Airplane {
    private int flightNumber;
    private String destination;
    String departureTime;



    public Airplane(int flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = LocalTime.parse(departureTime.toString()).toString();
    }


    public void fligthStatus(String currentPlace) {

        if(currentPlace.equalsIgnoreCase(destination)) {
            System.out.println("The flight has arrived");
        }
        else {
            System.out.println("Flight still on the way");
        }

    }


    public void delay(){
        if(LocalTime.now().isAfter(LocalTime.parse(departureTime))){
            System.out.println("There will be a delay");
        }
        else
            System.out.println("The departure is on time");


    }
    public void showDetails(){
        System.out.println("Departure time: "+departureTime + "\n" + destination + "\n" + flightNumber);
    }


}
