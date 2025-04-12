/*
Write a Java program to create a class called "Employee" with a name, salary,
and hire date attributes, and a method to calculate years of service.
* */


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee {
    private String name;
    private double salary;
    private String hireDate;


    public Employee(String name, double salary, String hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public void yearsOfService(){
        LocalDate today = LocalDate.now();
        LocalDate hire = LocalDate.parse(hireDate);
        long years = ChronoUnit.YEARS.between(hire, today);
        System.out.println(years);
    }

}
