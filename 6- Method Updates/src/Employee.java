/*
* 6. Write a Java program to create a class called "Employee" with a name,
*  job title, and salary attributes, and methods to calculate and update salary
* */


public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public double calculateSalary() {
        salary -= salary * 0.14;
        return salary;
    }
    public double updateSalary(double bonus) {
        salary += bonus;
        return salary;
    }

}
