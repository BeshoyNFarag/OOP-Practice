/*
Write a Java program to create a class called "Employee" with a name,
job title, and salary attributes, and methods to calculate and update salary
 */


public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Beshoy", "SWE", 2500);
        System.out.println(employee.calculateSalary());
        System.out.println(employee.updateSalary(200));
    }
}