/*
Write a Java program to create a class called "Shape" with abstract methods for calculating
area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".
*/



public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();


        System.out.println(circle.circlePerimeter(4.6));
        System.out.println(circle.circleArea(6.2));

        System.out.println();
        System.out.println(triangle.area(3,5));
        System.out.println(triangle.traingleParameter(3.5,2.3,7.2));


        System.out.println();
        System.out.println(rectangle.area(3,5));
        System.out.println(rectangle.perimeter(3.5,2.3));


        System.out.println(circle.area(2.3,421));
        System.out.println();


        System.out.println(triangle.traingleParameter(3,4,5));
    }
}