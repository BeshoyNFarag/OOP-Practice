public class TrafficLight {


    public void startTrafficLight() {

        while (true) {
            System.out.println("Red Light Stop!");
            holdColor(30);
            System.out.println("Yellow Light!");
            holdColor(5);
            System.out.println("Green Light!");
            holdColor(60);
        }

    }



    public void holdColor(int seconds){

        try {
            Thread.sleep(seconds * 1000);
        }
        catch(Exception e){
            System.out.println("Traffic Light bug");
        }


    }
}
