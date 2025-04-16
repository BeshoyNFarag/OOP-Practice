/*
 Write a Java program to create a class called "Restaurant" with attributes for menu items,
 prices, and ratings, and methods to add and remove items, and to calculate average rating.
*/

import java.util.ArrayList;

public class Restaurant {
    ArrayList<String> ratings = new ArrayList<>();
    ArrayList<String> items = new ArrayList<>();


    public void addRating(String rating) {
        ratings.add(rating);
    }
    public void displayRatings() {
        ratings.forEach(r -> System.out.println("Review: "+r));
    }
    public void averageRating() {
        double averageRating = 0;
        double totalRating = 0;
        for (String rating : ratings) {
            totalRating += rating.length();
        }
        averageRating = totalRating / ratings.size();
        System.out.println("The average rating is: " + averageRating);
    }
    public void addItem(String item) {
        items.add(item);
    }
    public void removeItem(String item) {
        items.remove(item);
    }
    public void displayItems() {
        System.out.println("Items are: ");
        items.forEach(i -> System.out.println(i));
    }
    public void addMenuitem(Menu menu){

        menu.addItem(menu.item, menu.price);
    }
    public void showMenuItems(Menu menu){
        menu.showMenu();
    }


}