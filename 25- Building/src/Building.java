/*
Write a Java program to create a class called "Building" with attributes for address,
number of floors, and total area. Create subclasses "ResidentialBuilding" and "CommercialBuilding"
that add specific attributes like number of apartments for residential and office space for commercial
buildings. Implement a method to calculate the total rent for each subclass.
*/



public class Building {
    protected String address;
    protected int floorsNumber;
    protected float area;


    public Building(String address, int floorsNumber, float area) {
        this.address = address;
        this.floorsNumber = floorsNumber;
        this.area = area;
    }


}
