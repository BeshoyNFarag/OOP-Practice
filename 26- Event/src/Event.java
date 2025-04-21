/*
Write a Java program to create a class called "Event" with attributes for event name, date,
and location. Create subclasses "Seminar" and "MusicalPerformance" that add specific attributes
like number of speakers for seminars and performer list for concerts. Implement methods to display
event details and check for conflicts in the event schedule.
*/

import java.time.LocalDate;
import java.util.ArrayList;

public class Event {

    protected String name;
    protected String date;
    protected String location;
    static ArrayList<LocalDate> dates = new ArrayList<>();


    public Event(String name, String date, String location) {
        this.name = name;
        this.date = date;
        this.location = location;
        LocalDate myDate = LocalDate.parse(date);

        if (isConflict(myDate)){
            System.out.println("This date already has an event you can not add an event to this date!");
        }
        else
            dates.add(myDate);

    }
    public boolean isConflict(LocalDate myDate){
        if (dates.contains(myDate)){
            return true;
        }
        else
            return false;

    }
}
