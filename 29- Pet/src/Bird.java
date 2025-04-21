/*
29. Write a Java program to create a class called "Pet" with attributes for name, species, and age.
Create subclasses "Dog" and "Bird" that add specific attributes like favorite toy for dogs and wing span
for birds. Implement methods to display pet details and calculate the pet's age in human years.
*/


public class Bird extends Pet{
    private int wingSpan;


    public Bird(String name, int age, String species, int wingSpan) {
        super(name, age ,species);
        this.wingSpan = wingSpan;
    }



    public void getDetails(){

        System.out.printf("Pet's Name: %s%nPets Age: %d%nPets Species: %s%nWing Span: %d%n", name, age, species, wingSpan);

    }
    public void petAgeHuman(){
       int birdAge = age * 6;
        System.out.println("the birds age(in human): " + birdAge);
    }
}
