/*
Write a Java program to create a class called "Course" with attributes for course name,
instructor, and credits. Create a subclass "OnlineCourse" that adds attributes for platform and duration.
Implement methods to display course details and check if the course is eligible for a certificate based on
duration.
*/


import java.time.Duration;

public class OnlineCourse extends Course {

    private String platform;
    private Duration courseDuration;
    private Duration takenDuration;

    public OnlineCourse(String name, String instructor,String platform, Duration courseDuration) {
        super( name, instructor);
        this.platform = platform;
        this.courseDuration = courseDuration;

    }
    public void setDurationtaken(Duration takenDuration){
        this.takenDuration = takenDuration;
    }

    public boolean isEligible (){
        if (courseDuration.compareTo(takenDuration) <= 0){
            return true;
        }
        else
            return false;
    }


    public void certified(){
        if(isEligible()){
            System.out.println("\nCongratulations! You are eligible to take the certificate!\n");
        }
        else
            System.out.println("\nYou are not eligible to take the certificate!\n");
    }
    public void getDetails(){
        System.out.printf("Course Name: %s%nCourseInstructor: %s%nCourse Credit:%s", name, instructor, credits);
        System.out.println("\nCourse Duration: " + courseDuration.toHours() +"\nDuration taken: " + takenDuration.toHours());
    }
}
