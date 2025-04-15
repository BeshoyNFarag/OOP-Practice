/*
Write a Java program to create a class called "Shape" with abstract methods for calculating
area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".
*/



public class Circle extends Shape {



    public double circleArea(double radius){
        return (radius * radius) * Math.PI;
    }
    public double circlePerimeter(double radius){
        return Math.PI * radius * 2;

    }

    public double area(double base , double height){
        throw new UnsupportedOperationException("Not applicable for this shape");
    }
    public double perimeter(double base , double height){
        throw new UnsupportedOperationException("Not applicable for this shape");
    }
    public  double traingleParameter(double side1, double side2, double side3){
        throw new UnsupportedOperationException("Not applicable for this shape");
    }
}
