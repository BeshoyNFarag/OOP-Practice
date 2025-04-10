/*
* Write a Java program to create a class called "Rectangle" with width and height attributes.
* Calculate the area and perimeter of the rectangle.
* */

public class Rectangle {
    private int height;
    private int width;

    public void perimeter(int height, int width) {
        this.height = height;
        this.width = width;
        int result = 2* (height + width);
        System.out.println("the perimeter of the rectangle is " + result);
    }

    public void area(int height, int width) {
        this.height = height;
        this.width = width;
        int result = (height * width);
        System.out.println("your area of the rectangle is " + result );
    }

}
