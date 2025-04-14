/*
 Write a Java program to create a class called "School" with attributes for students, teachers,
 and classes, and methods to add and remove students and teachers, and to create classes.

*/


import java.util.ArrayList;

public class School {
    private ArrayList<String> students = new ArrayList<>();
    private ArrayList<String> teachers = new ArrayList<>();
    private ArrayList<String> classes = new ArrayList<>();


    public void addStudent(String student){
        students.add(student);
    }
    public void removeStudent(String student){
        students.remove(student);
    }

    public void addTeacher(String teacher){
        teachers.add(teacher);
    }
    public void removeTeacher(String teacher){
        teachers.remove(teacher);
    }

    public void addClasses(String classess){
        classes.add(classess);
    }
    public void removeClasses(String classess){
        classes.remove(classess);
    }

    public void showTeachers(){
        System.out.println(teachers);
    }
    public void showStudents(){
        System.out.println(students);
    }
    public void showClasses(){
        System.out.println(classes);
    }

    public void showAll(){
        showStudents();
        showTeachers();
        showClasses();
    }




}
