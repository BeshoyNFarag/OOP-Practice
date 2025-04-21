/*
Write a Java program to create a class called "CustomerOrder" with attributes for order ID,
customer, and order date. Create a subclass "OnlineOrder" that adds attributes for delivery address
and tracking number. Implement methods to calculate delivery time based on the address and update the
tracking status.
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class OnlineOrder extends CustomerOrder {
    private int trackingNumber;
    private String deliveryAddress;


    public OnlineOrder(String orderID, String costumerName, String orderDate, int trackingNumber, String deliveryAddress){
        super(orderID, costumerName, orderDate);
        this.trackingNumber = trackingNumber;
        this.deliveryAddress = deliveryAddress;
    }

    public void deliveryTime(){
        // This method calculates the daays between your order and the current date
        // the date we take from the costumer should be in yyyy-mm-dd form

        LocalDate currentDate = LocalDate.now();
        System.out.println("Days of waiting (already done): " + ChronoUnit.DAYS.between(orderDate, currentDate));

    }

    public void trackingStatus(){

        LocalDate currentDate = LocalDate.now();
        if(ChronoUnit.DAYS.between(orderDate, currentDate) > 4){
            System.out.println("your order has been delivered");
        }
        else if (ChronoUnit.DAYS.between(orderDate, currentDate) > 3){
            System.out.println("Your order is on the way");
        }
        else if (ChronoUnit.DAYS.between(orderDate, currentDate) > 2){
            System.out.println("Your order has been shipped");
        }
        else
            System.out.println("Your order is still being packed");

    }


}
