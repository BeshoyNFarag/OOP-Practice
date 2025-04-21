/*
Write a Java program to create a class called "Reservation" with attributes for reservation ID,
customer name, and date. Create subclasses "ResortReservation" and "RailwayReservation" that add
specific attributes like room number for hotels and seat number for flights. Implement methods to
check reservation status and modify reservation details.
*/

import java.time.LocalDate;

public class Reservation {
    protected String resrvationID;
    protected String costumerName;
    protected LocalDate reservationDate;


    public Reservation(String resrvationID, String costumerName, String reservationDate) {
        this.resrvationID = resrvationID;
        this.costumerName = costumerName;
        this.reservationDate = LocalDate.parse(reservationDate);

    }

}
