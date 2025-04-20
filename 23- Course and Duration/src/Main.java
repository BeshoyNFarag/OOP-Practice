/*
Write a Java program to create a class called "Course" with attributes for course name,
instructor, and credits. Create a subclass "OnlineCourse" that adds attributes for platform and duration.
Implement methods to display course details and check if the course is eligible for a certificate based on
duration.
*/


import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        Course python = new Course("Python Crash Course", "Bola");
        python.addCredit("Bola Maged");
        python.addCredit("Kerolos Nady");
        python.getDetails();
        System.out.println();
        System.out.println();


        OnlineCourse cpp = new OnlineCourse("C++ Crash Course", "Beshoy", "Udemy", Duration.ofHours(2));
        cpp.setDurationtaken(Duration.ofHours(3));
        cpp.addCredit("Beshoy Nady");
        cpp.addCredit("Kerolos Nady");
        cpp.addCredit("Evram Nady");
        cpp.getDetails();
        cpp.isEligible();
        cpp.certified();

    }

}