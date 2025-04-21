/*
Write a Java program to create a class called "Event" with attributes for event name, date,
and location. Create subclasses "Seminar" and "MusicalPerformance" that add specific attributes
like number of speakers for seminars and performer list for concerts. Implement methods to display
event details and check for conflicts in the event schedule.
*/

import java.time.LocalDate;

public class Seminar extends Event {

    private int numberSpeakers;

    public Seminar(String name, String date, String location, int numberSpeakers) {
        super(name, date, location);
        this.numberSpeakers = numberSpeakers;
    }



    public void getDetails(){
        System.out.printf("Seminar Name: %s%nSeminar Date: %s%nSeminar Location: %s%nSeminar Speakers: %d%n", name, date, location, numberSpeakers);
    }
}
