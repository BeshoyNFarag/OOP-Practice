/*
 * Write a Java program to create a class called "Circle" with a radius attribute.
 * You can access and modify this attribute. Calculate the area and circumference of the circle.
 */



public class Circle {
    public static double radius;

    public void area(double radius){
        Circle.radius = radius;
        double area = Math.PI * radius * radius;
        System.out.printf("the circle's area is: %.2f%n",area);
    }
    public void circumference(double radius){
        Circle.radius = radius;
        double circumference = 2 * Math.PI * radius;
        System.out.printf("the circle's circumference is: %.2f%n",circumference);
    }

}
