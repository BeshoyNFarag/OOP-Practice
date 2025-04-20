/*
Write a Java program to create a class called "Building" with attributes for address,
number of floors, and total area. Create subclasses "ResidentialBuilding" and "CommercialBuilding"
that add specific attributes like number of apartments for residential and office space for commercial
buildings. Implement a method to calculate the total rent for each subclass.
*/

public class Main {
    public static void main(String[] args) {
        ResidentialBuilding resident = new ResidentialBuilding("09648 Mittweida", 4 , 15.4f);
        CemmercialBuilding comm = new CemmercialBuilding("09648 Sicilly", 4 , 15.4f);
        resident.calculateRent();
        comm.calculateRent();
        resident.showRent();
        comm.showRent();
    }
}