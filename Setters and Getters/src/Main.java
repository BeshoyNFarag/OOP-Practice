/*
Write a Java program to create a class called "Dog" with a name and breed attribute.
Create two instances of the "Dog" class, set their attributes using the constructor
and modify the attributes using the setter methods and print the updated values.
*/

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog ("rex", "bull dog");
        Dog dog2 = new Dog("filo","bull dog");


        dog.setBreed("Golden Retriever");
        dog.setName("Thunder");
        dog2.setName("Storm");
        dog2.setBreed("Rot Weiler");


        System.out.println(dog.getName());
        System.out.println(dog.getBreed());
        System.out.println();
        System.out.println(dog2.getName());
        System.out.println(dog2.getBreed());

    }
}