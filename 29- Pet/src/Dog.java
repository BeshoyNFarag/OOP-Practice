/*
29. Write a Java program to create a class called "Pet" with attributes for name, species, and age.
Create subclasses "Dog" and "Bird" that add specific attributes like favorite toy for dogs and wing span
for birds. Implement methods to display pet details and calculate the pet's age in human years.
*/


public class Dog extends Pet {
    private String favToy;

    public Dog(String name, int age, String species,String favToy ) {
        super(name, age ,species);
        this.favToy = favToy;
    }

    public void getDetails(){

        System.out.printf("Pet's Name: %s%nPets Age: %d%nPets Species: %s%nFav Toy: %s%n", name, age, species, favToy);

    }
    public void petAgeHuman(){
        int dogAge = age * 7;
        System.out.println("Dog age is (in human age): " + dogAge);
    }
}
