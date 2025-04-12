/*
*  Write a Java program to create class called "TrafficLight" with attributes for color and duration,
* and methods to change the color and check for red or green.
* */


public class TrafficLight {
    private int duration;
    private String color;



    public TrafficLight(String color, int duration){
        this.color = color;
        this.duration = duration;
    }

    public boolean redLight(){
        return color.equalsIgnoreCase("red");
    }
    public boolean greenLight() {
        return color.equalsIgnoreCase("green");
    }
    public boolean yellowLight() {
        return color.equalsIgnoreCase("yellow");
    }


    public void startTrafficLight() {

        while (true) {
            if (redLight()) {
                System.out.println("Red light you can not pass!");
                holdColor(duration);
                System.out.println("Yellow Light!");
                holdColor(5);
                System.out.println("Green Light you can go!");
                holdColor(60);
            }
            else if (yellowLight()) {
                System.out.println("Yellow Light!");
                holdColor(duration);
                System.out.println("Green Light you can go!");
                holdColor(60);
                System.out.println("Yellow Light!");
                holdColor(duration);
                System.out.println("Red light you can not pass!");
                holdColor(45);

            }
            else if (greenLight()) {
                System.out.println("Green Light you can go!");
                holdColor(duration);
                System.out.println("Yellow Light!");
                holdColor(5);
                System.out.println("Red light you can not pass!");
                holdColor(40);
            }




        }

    }



    public void holdColor(int duration){

        try {
            Thread.sleep(duration * 1000);
        }
        catch(Exception e){
            System.out.println("Traffic Light bug");
        }


    }
}
