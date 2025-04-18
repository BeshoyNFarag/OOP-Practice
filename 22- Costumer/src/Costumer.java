/*
Write a Java program to create a class called "Customer" with attributes for name, email, and
purchase history. Implement methods to add purchases to the history and calculate total expenditure.
Create a subclass "LoyalCustomer" that adds a discount rate attribute and a method to apply the discount.
*/


import java.util.ArrayList;

public class Costumer {

    protected String name;
    protected String email;
    protected double amountNow;
    protected double totalAmount;
    protected double price;
    protected String item;
    Purchase <String, Double> purchase = new Purchase<>(item, price);


}
