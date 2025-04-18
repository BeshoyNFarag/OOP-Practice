/*
Write a Java program to create a class called "Vehicle" with attributes for make, model,
and year. Create subclasses "Car" and "Truck" that add specific attributes like trunk size
for cars and payload capacity for trucks. Implement a method to display vehicle details in each subclass.
*/

public class Truck extends Vehicle {
    private double payloadCapacity;

    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make,model,year);
        this.payloadCapacity = payloadCapacity;
    }


    public void getVehicleDetail(){
        System.out.printf("Truck Make: %s%nModel: %s%nYear: %d%nTrunk Size: %.2f%n", make,model,year,payloadCapacity);
    }
}
