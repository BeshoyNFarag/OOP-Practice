/*
Write a Java program to create a class called "Building" with attributes for address,
number of floors, and total area. Create subclasses "ResidentialBuilding" and "CommercialBuilding"
that add specific attributes like number of apartments for residential and office space for commercial
buildings. Implement a method to calculate the total rent for each subclass.
*/


public class ResidentialBuilding extends Building {
    private final float APARTMENTS_TAX = 0.05f;

    public ResidentialBuilding(String address, int floorsNumber, float area){
        super(address, floorsNumber, area);
    }

    public double calculateRent(){

        int totalArea = (int)(floorsNumber * area);

        return totalArea + (totalArea * APARTMENTS_TAX );

    }
    public void showRent(){
        System.out.println((float)calculateRent());
    }
}
