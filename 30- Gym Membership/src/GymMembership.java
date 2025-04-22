/*
Write a Java program to create a class called "GymMembership" with attributes for member name,
membership type, and duration. Create a subclass "PremiumMembership" that adds attributes for personal
trainer availability and spa access. Implement methods to calculate membership fees and check for special
offers based on membership type.
*/

import java.time.Duration;


public class GymMembership {
    protected String memeberName;
    protected String membershipType;
    protected Duration duration;


    public GymMembership(String memeberName, String membershipType, String duration) {
        this.memeberName = memeberName;
        this.membershipType = membershipType;
        this.duration = Duration.ofDays(Integer.parseInt(duration));

    }

    public double fees() {
        return duration.toDays() * 1.5;
    }

    public void offers(){
        switch(membershipType){
            case "Normal" -> System.out.println("You get 1 month free for each year");
            case "Platinum" -> System.out.println("You get 2 month free for each year");
            case "Gold" -> System.out.println("You get 3 month free for each year and Spa Access");
            default -> PremuimMembership.offer();
        }
    }
}
