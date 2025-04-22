/*
Write a Java program to create a class called "GymMembership" with attributes for member name,
membership type, and duration. Create a subclass "PremiumMembership" that adds attributes for personal
trainer availability and spa access. Implement methods to calculate membership fees and check for special
offers based on membership type.
*/



public class PremuimMembership extends GymMembership {
    private String personalTrainer;
    private boolean spaAccess;

    public PremuimMembership(String memeberName, String membershipType, String duration,String personalTrainer, boolean spaAccess) {
        super( memeberName,  membershipType,  duration);
        this.personalTrainer = personalTrainer;
        this.spaAccess = spaAccess;
    }

    public double fees(){

        if (spaAccess){
            return duration.toDays() * 2.25;
        }
        else
            return duration.toDays() * 1.75;

    }
    public static void offer(){
        System.out.println("You get 3 months free for each year, spa access, and personal trainer");
    }



}
