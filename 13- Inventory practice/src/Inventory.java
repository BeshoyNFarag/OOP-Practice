/*
Write a Java program to create a class called "Inventory" with a collection of
products and methods to add and remove products, and to check for low inventory.
* */


import java.util.ArrayList;

public class Inventory {
    ArrayList<String> products = new ArrayList<>();


    public void addProduct(String product){
        products.add(product);
    }

    public void removeProduct(String product){
        products.remove(product);
    }


    public boolean isProduct(){
        if (products.size() <= 20){
            return true;
        }
        else
            return false;
    }

    public void showProducts(){
        products.forEach(product -> System.out.println(product));
    }

}
