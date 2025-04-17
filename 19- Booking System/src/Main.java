/*
Write a Java program to create a class with methods to search for flights and hotels,
and to book and cancel reservations.
*/

public class Main {
    public static void main(String[] args) {
        DataStorage ds = new DataStorage();
        BookingSystem bs = new BookingSystem(ds);
        ds.addFlight("NewYork");
        ds.addFlight("FFM");
        ds.addFlight("New England");


        ds.addHotel("B&B");
        ds.addHotel("Hilton");
        ds.addHotel("Sheraton");

        System.out.println(bs.searchHotel("Hilton"));
        System.out.println(bs.searchFlight("FFM"));

        bs.bookFlight("New England");
        bs.bookHotel("B&B");
        bs.cancelFlight("New England");
        bs.cancelHotel("Hilton");
        bs.cancelFlight("New England");

    }
}