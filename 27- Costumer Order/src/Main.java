/*
Write a Java program to create a class called "CustomerOrder" with attributes for order ID,
customer, and order date. Create a subclass "OnlineOrder" that adds attributes for delivery address
and tracking number. Implement methods to calculate delivery time based on the address and update the
tracking status.
*/

public class Main {
    public static void main(String[] args) {
        OnlineOrder myOrder = new OnlineOrder("DE27342", "Beshoy", "2025-04-15", 79342, "FFM 60489" );
        myOrder.deliveryTime();
        System.out.println();
        myOrder.trackingStatus();

    }
}