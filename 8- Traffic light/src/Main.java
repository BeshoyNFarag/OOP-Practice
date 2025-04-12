/*
Write a Java program to create class called "TrafficLight" with attributes for color and duration,
and methods to change the color and check for red or green.
*/


public class Main {
    public static void main(String[] args) {
        TrafficLight tl = new TrafficLight("green", 30);
        tl.greenLight();
        tl.startTrafficLight();
    }
}