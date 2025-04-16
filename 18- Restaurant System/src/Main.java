/*
 Write a Java program to create a class called "Restaurant" with attributes for menu items,
 prices, and ratings, and methods to add and remove items, and to calculate average rating.
*/


public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Menu<String, Double> drinksMenu = new Menu<>("Coke", 4.50);
        restaurant.addRating("****");
        restaurant.addRating("***");
        restaurant.addRating("**");
        restaurant.addRating("*****");
        restaurant.addRating("*****");
        restaurant.addRating("*****");
        restaurant.displayRatings();
        restaurant.averageRating();

        drinksMenu.addItem("Coke", 4.50);
        drinksMenu.addItem("Mojito", 13.4);
        drinksMenu.addItem("Pepsi", 5.0);
        drinksMenu.addItem("white wine", 15.25);
        drinksMenu.addItem("red wine", 12.45);
        System.out.println();


        restaurant.addMenuitem(drinksMenu);
        restaurant.showMenuItems(drinksMenu);


    }
}