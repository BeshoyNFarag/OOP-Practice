/*
Write a Java program to create a class called "ElectronicsProduct" with attributes for product ID,
name, and price. Implement methods to apply a discount and calculate the final price. Create a subclass "
WashingMachine" that adds a warranty period attribute and a method to extend the warranty.
*/


import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        WashingMachine dishwasher = new WashingMachine("ID225As8", "Dish Washer", 500, Duration.ofDays(700));
        dishwasher.extendWarranty(Duration.ofDays(200));
        dishwasher.applyDiscount(12);
        dishwasher.getDetails();

    }
}