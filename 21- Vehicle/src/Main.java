/*
Write a Java program to create a class called "Vehicle" with attributes for make, model,
and year. Create subclasses "Car" and "Truck" that add specific attributes like trunk size
for cars and payload capacity for trucks. Implement a method to display vehicle details in each subclass.
*/

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "2025", 2025, 27);
        car.getVehicleDetail();
        System.out.println();

        Truck truck = new Truck("Mercedes", "2025", 2011, 89.2);
        truck.getVehicleDetail();

    }
}