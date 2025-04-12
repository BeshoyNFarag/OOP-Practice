/*
 Write a Java program to create a class called "Student" with a name, grade,
 and courses attributes, and methods to add and remove courses.
*/


public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("John", 2.78f);
        student1.addCourse("Theoretical Computer Science");
        student1.addCourse("Agile Software Development");
        student1.addCourse("Databases");
        student1.addCourse("Human Computer Interfaces");
        student1.addCourse("Italian A2.2");
        student1.getCourses();
        student1.removeCourse("Databases");
        student1.showDetails();



    }
}