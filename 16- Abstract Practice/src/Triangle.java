/*
Write a Java program to create a class called "Shape" with abstract methods for calculating
area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".
*/



public class Triangle extends Shape {


    private double height;
    private double base;
    private double side1;
    private double side2;
    private double side3;

    public double area(double height, double base){
        return 0.5 * height * base;

    }
    public double traingleParameter(double side1, double side2, double side3){
        return side1 + side2 + side3;
    }

    public double perimeter(double base , double height){
        throw new UnsupportedOperationException("Not applicable for this shape");
    }

    public double circleArea(double radius){
        throw new UnsupportedOperationException("Not applicable for this shape");
    }
    public double circlePerimeter(double radius){
        throw new UnsupportedOperationException("Not applicable for this shape");
    }
}
