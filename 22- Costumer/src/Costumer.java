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
    Purchase <String, Double> purchaseMain = new Purchase<>(item, price);
    public void addPurchase (Purchase purchase){
        purchaseMain.addItem(purchase);
    }
   public void getPurchases(){
        for(Purchase pur : purchaseMain.purchases){
            System.out.println(pur.getItem() + ": " + pur.getPrice());
        }
   }

    public void removePurchase (Purchase purchase){
        purchaseMain.removeItem(purchase);
    }

    public void getTotalAmount(){
        for (Purchase pur : purchaseMain.purchases){
            totalAmount += pur.getPrice();
        }
        System.out.println( "Your total purchases are for: "+totalAmount);
    }



}
