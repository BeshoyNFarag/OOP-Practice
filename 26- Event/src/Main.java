/*
Write a Java program to create a class called "Event" with attributes for event name, date,
and location. Create subclasses "Seminar" and "MusicalPerformance" that add specific attributes
like number of speakers for seminars and performer list for concerts. Implement methods to display
event details and check for conflicts in the event schedule.
*/

public class Main {
    public static void main(String[] args) {
        Seminar seminar = new Seminar("OOP Lecture", "2025-03-14", "Campus 3", 5);
        seminar.getDetails();
        System.out.println();
        System.out.println();
        MusicalPerformance music = new MusicalPerformance("Vivaldi", "2025-03-14", "FFM Opera", "Dead Vivaldi Lol");
        music.getDetails();
        System.out.println();
        System.out.println(Event.dates);


    }

}