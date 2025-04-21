/*
Write a Java program to create a class called "Reservation" with attributes for reservation ID,
customer name, and date. Create subclasses "ResortReservation" and "RailwayReservation" that add
specific attributes like room number for hotels and seat number for flights. Implement methods to
check reservation status and modify reservation details.
*/


public class ResortReservation extends Reservation {
    private int roomNumber;

    public ResortReservation(String resrvationID, String costumerName, String reservationDate,int roomNumber ){
        super(resrvationID, costumerName, reservationDate);
        this.roomNumber = roomNumber;
    }


}
