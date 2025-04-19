/*
Write a Java program to create a class called "Customer" with attributes for name, email, and
purchase history. Implement methods to add purchases to the history and calculate total expenditure.
Create a subclass "LoyalCustomer" that adds a discount rate attribute and a method to apply the discount.
*/

public class Main {
    public static void main(String[] args) {
        Costumer costumer = new Costumer();
        LoyalCostumer loyalCostumer = new LoyalCostumer();
        Purchase<String, Double> purhcase1 = new Purchase<>("Coke", 4.5);
        Purchase<String, Double> purhcase2 = new Purchase<>("Pepsi", 5);

        costumer.addPurchase(purhcase1);
        costumer.addPurchase(purhcase2);
        costumer.getPurchases();
        costumer.getTotalAmount();


        loyalCostumer.addPurchase(purhcase1);
        loyalCostumer.addPurchase(purhcase2);
        loyalCostumer.discount(12.5f);




    }
}