/*
1. Write a Java program to create a class called "Person" with a name and age attribute.
Create two instances of the "Person" class, set their attributes using the constructor,
and print their name and age.
* */

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;

        System.out.println("Hello my name is: " + name);
        System.out.println("Hello my age is : " + age);
    }

}
