/*
12. Write a Java program to create a class called "Airplane" with a flight number, destination,
and departure time attributes, and methods to check flight status and delay.

**/

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Airplane condor = new Airplane(66382, "Leipzig", "12:04:23");
        condor.delay();
        condor.fligthStatus("leipzig");
        condor.showDetails();
    }
}