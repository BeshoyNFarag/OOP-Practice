/*
Write a Java program to create a class called "Event" with attributes for event name, date,
and location. Create subclasses "Seminar" and "MusicalPerformance" that add specific attributes
like number of speakers for seminars and performer list for concerts. Implement methods to display
event details and check for conflicts in the event schedule.
*/

import javax.swing.*;
import java.time.LocalDate;

public class MusicalPerformance extends Event {
    private String performer;
    public MusicalPerformance(String name, String date, String location, String performer) {
        super(name, date, location);
        this.performer = performer;
    }

    public void getDetails(){
        System.out.printf("Musical Name: %s%nMusical Date: %s%nMusical Location: %s%nMusical Performer: %s%n", name, date, location, performer, performer);
    }
}
