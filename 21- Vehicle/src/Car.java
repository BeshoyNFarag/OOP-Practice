/*
Write a Java program to create a class called "Vehicle" with attributes for make, model,
and year. Create subclasses "Car" and "Truck" that add specific attributes like trunk size
for cars and payload capacity for trucks. Implement a method to display vehicle details in each subclass.
*/

public class Car extends Vehicle {
    private int trunkSize;

    public Car(String make, String model, int year, int trunkSize) {
        super(make,model,year);
        this.trunkSize = trunkSize;
    }

    public void getVehicleDetail(){
        System.out.printf("Car Make: %s%nModel: %s%nYear: %d%nTrunk Size: %d%n", make,model,year,trunkSize);
    }
}
