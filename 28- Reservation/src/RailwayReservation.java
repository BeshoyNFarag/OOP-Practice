/*
Write a Java program to create a class called "Reservation" with attributes for reservation ID,
customer name, and date. Create subclasses "ResortReservation" and "RailwayReservation" that add
specific attributes like room number for hotels and seat number for flights. Implement methods to
check reservation status and modify reservation details.
*/

public class RailwayReservation extends Reservation {
    private int seatNumber;

    public RailwayReservation(String resrvationID, String costumerName, String reservationDate,int seatNumber ){
        super(resrvationID, costumerName, reservationDate);
        this.seatNumber = seatNumber;
    }


}
