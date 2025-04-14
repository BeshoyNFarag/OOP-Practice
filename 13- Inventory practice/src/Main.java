/*
Write a Java program to create a class called "Inventory" with a collection of
products and methods to add and remove products, and to check for low inventory.
* */


public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addProduct("Milk");
        inventory.addProduct("Cheese");
        inventory.addProduct("Pepsi");
        inventory.addProduct("Potato");
        inventory.addProduct("Sweet Potato");
        inventory.addProduct("Fanta");
        inventory.addProduct("Bacon");
        inventory.addProduct("Bread");


        inventory.removeProduct("Pepsi");
        System.out.println(inventory.isProduct());
        System.out.println();
        inventory.showProducts();


    }
}