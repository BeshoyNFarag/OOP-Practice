/*
Write a Java program to create a class called "Shape" with abstract methods for calculating
area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".
*/


import javax.print.attribute.UnmodifiableSetException;

public class Rectangle extends Shape {
    private double base;
    private double height;

    public double area(double base , double height){

        return base*height;
    }


    public double perimeter(double base , double height){

        return 2 * (base + height);

    }

    public double traingleParameter(double side1, double side2, double side3){
         throw new UnmodifiableSetException("Not applicable for this shape");
    }
    public double circleArea(double radius){
        throw new UnmodifiableSetException("Not applicable for this shape");
    }
    public double circlePerimeter(double radius){
        throw new UnmodifiableSetException("Not applicable for this shape");
    }

}

