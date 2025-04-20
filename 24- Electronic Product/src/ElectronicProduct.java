/*
Write a Java program to create a class called "ElectronicsProduct" with attributes for product ID,
name, and price. Implement methods to apply a discount and calculate the final price. Create a subclass "
WashingMachine" that adds a warranty period attribute and a method to extend the warranty.
*/


public class ElectronicProduct {
    protected String productID;
    protected String name;
    protected double price;
    protected float discount;

    public ElectronicProduct(String productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public double applyDiscount(float discount) {
        this.discount = discount ;
        return price = price - ((discount/100) * (price));
    }

    public void getDetails(){
        System.out.println(price + " " + name + " " + productID);

    }

}
