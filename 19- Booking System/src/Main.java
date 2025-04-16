/*
Write a Java program to create a class with methods to search for flights and hotels,
and to book and cancel reservations.
*/

public class Main {
    public static void main(String[] args) {
        DataStorage ds = new DataStorage();
        ds.addFlight("NewYork");
        ds.addFlight("FFM");
        ds.addFlight("New England");

        System.out.println(ds.flights);

        BookingSystem bs = new BookingSystem(ds); // pass the same ds
        bs.searchFlight("New England");
    }
}