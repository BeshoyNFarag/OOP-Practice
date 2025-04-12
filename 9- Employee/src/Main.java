/*
Write a Java program to create a class called "Employee" with a name, salary,
and hire date attributes, and a method to calculate years of service.
* */


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the employee's name: ");
        String name = scanner.nextLine();
        System.out.print("which date did the employee start YYYY-MM-DD: ");
        String hireDate = scanner.nextLine();
        System.out.print("What is the employee's salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee( name,  salary, hireDate);
        employee.yearsOfService();

    }
}