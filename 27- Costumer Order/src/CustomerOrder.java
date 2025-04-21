/*
Write a Java program to create a class called "CustomerOrder" with attributes for order ID,
customer, and order date. Create a subclass "OnlineOrder" that adds attributes for delivery address
and tracking number. Implement methods to calculate delivery time based on the address and update the
tracking status.
*/

import java.time.LocalDate;

public class CustomerOrder {
    protected String orderID;
    protected String costumerName;
    protected LocalDate orderDate;


    public CustomerOrder(String orderID, String costumerName, String orderDate) {
        this.orderID = orderID;
        this.costumerName = costumerName;
        this.orderDate = LocalDate.parse(orderDate);
    }
}
