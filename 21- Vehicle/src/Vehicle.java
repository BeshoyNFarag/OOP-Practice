/*
Write a Java program to create a class called "Vehicle" with attributes for make, model,
and year. Create subclasses "Car" and "Truck" that add specific attributes like trunk size
for cars and payload capacity for trucks. Implement a method to display vehicle details in each subclass.
*/

public class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;

    }


}
