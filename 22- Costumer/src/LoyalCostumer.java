public class LoyalCostumer extends Costumer {


    private float discount;
    public void discount(float discount) {
        getTotalAmount();
        this.discount = discount;
        discount /= 100;
        System.out.println("But because you are loyal it becomes: " + (totalAmount - (totalAmount * discount)));

    }
}
