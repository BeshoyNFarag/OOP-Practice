/*
Write a Java program to create a class called "ElectronicsProduct" with attributes for product ID,
name, and price. Implement methods to apply a discount and calculate the final price. Create a subclass "
WashingMachine" that adds a warranty period attribute and a method to extend the warranty.
*/



import java.time.Duration;

public class WashingMachine extends ElectronicProduct {

    Duration warranty;
    public WashingMachine(String productID, String name, double price, Duration warranty) {

        super(productID, name, price);
        this.warranty = warranty;
    }

    public void setWarranty(Duration warranty) {
        this.warranty = warranty;
    }
    public void extendWarranty(Duration warranty) {
        this.warranty = this.warranty.plus(warranty);
    }

    public void getDetails(){
        System.out.println("\nPrice: " + ((float) price) + "\nName: " + name + "\nID: " + productID + "\nWarranty: " + warranty.toDays() + " days");

    }
}
