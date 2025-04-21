/*
29. Write a Java program to create a class called "Pet" with attributes for name, species, and age.
Create subclasses "Dog" and "Bird" that add specific attributes like favorite toy for dogs and wing span
for birds. Implement methods to display pet details and calculate the pet's age in human years.
*/

public class Pet {
    protected String name;
    protected int age;
    protected String species;

    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void getDetails(){

        System.out.printf("Pet's Name: %s%nPets Age: %d%nPets Species: %s%n", name, age, species);

    }
    public void petAgeHuman(){
        System.out.println("cant calculate it unless specific animal passed");
    }
}
