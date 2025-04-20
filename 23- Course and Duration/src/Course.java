/*
Write a Java program to create a class called "Course" with attributes for course name,
instructor, and credits. Create a subclass "OnlineCourse" that adds attributes for platform and duration.
Implement methods to display course details and check if the course is eligible for a certificate based on
duration.
*/


import java.util.ArrayList;

public class Course {
    protected String name;
    protected String instructor;
    protected ArrayList<String> credits = new ArrayList<>();



    public Course(String name, String instructor) {
        this.name = name;
        this.instructor = instructor;
    }

    public void addCredit(String credit){
        credits.add(credit);
    }

    public void getDetails(){
        System.out.printf("Course Name: %s%nCourseInstructor: %s%nCourse Credit:%s", name, instructor, credits);
    }




}
