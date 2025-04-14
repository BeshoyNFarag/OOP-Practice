/*
 Write a Java program to create a class called "School" with attributes for students, teachers,
 and classes, and methods to add and remove students and teachers, and to create classes.

*/


public class Main {
    public static void main(String[] args) {

        School school = new School();

        school.addTeacher("Mohammed Hasssan");
        school.addStudent("Beshoy Farag");
        school.addClasses("Maths");

        school.showAll();

    }
}