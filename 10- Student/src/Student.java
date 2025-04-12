/*
Write a Java program to create a class called "Student" with a name, grade,
and courses attributes, and methods to add and remove courses.
*/


import java.sql.SQLOutput;
import java.util.ArrayList;

public class Student {
    private String name;
    private float grade;
    ArrayList<String> courses = new ArrayList<String>();

    public Student(String name, float grade) {
        this.name = name;
        this.grade = grade;
    }

    public void addCourse(String course){
        courses.add(course);
    }

    public void removeCourse(String course){
        courses.remove(course);
    }

    public void getCourses(){
        System.out.println(courses);
    }

    public void showDetails(){
        System.out.printf("Name: %s%nGrade: %.2f%nCourses: %s", name, grade,courses.toString());

    }

}
