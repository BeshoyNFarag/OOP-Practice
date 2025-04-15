/*
Write a Java program to create a class called "Shape" with abstract methods for calculating
area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".
*/



abstract public class Shape {


    public abstract double area(double base , double height);
    public abstract double perimeter(double base , double height);
    public abstract double traingleParameter(double side1, double side2, double side3);
    public abstract double circleArea(double radius);
    public abstract double circlePerimeter(double radius);



}
