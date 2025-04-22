/*
Write a Java program to create a class called "GymMembership" with attributes for member name,
membership type, and duration. Create a subclass "PremiumMembership" that adds attributes for personal
trainer availability and spa access. Implement methods to calculate membership fees and check for special
offers based on membership type.
*/


public class Main {
    public static void main(String[] args) {
        GymMembership gymMembership = new GymMembership("John Smith", "Normal","50" );
        System.out.println(gymMembership.fees());
        gymMembership.offers();
        PremuimMembership premuimMembership = new PremuimMembership("Joseph Paul", "Premuim", "90", "Adnreas Huesa", true);
        System.out.println(premuimMembership.fees());
        premuimMembership.offers();
    }
}