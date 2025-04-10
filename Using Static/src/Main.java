/*
* Write a Java program to create a class called "Circle" with a radius attribute.
* You can access and modify this attribute. Calculate the area and circumference of the circle.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Scanner scanner = new Scanner(System.in);
        Circle.radius = scanner.nextDouble();


        System.out.println(Circle.radius);
        circle.area(Circle.radius);
        circle.circumference(Circle.radius);
    }
}