/*
29. Write a Java program to create a class called "Pet" with attributes for name, species, and age.
Create subclasses "Dog" and "Bird" that add specific attributes like favorite toy for dogs and wing span
for birds. Implement methods to display pet details and calculate the pet's age in human years.
*/


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Rocky", 3, "Golden","Egyptian Blue Doll");
        dog.petAgeHuman();
        dog.getDetails();
        System.out.println();
        System.out.println();
        Bird bird = new Bird("Shiko", 2 , "Cocktail", 20);
        bird.petAgeHuman();
        bird.getDetails();

    }
}