import java.util.ArrayList;

public class Purchase <T, K>{

    private double price;
    private String item;
    public Purchase ( String item, double price){
        this.price = price;
        this.item = item;
    }
    ArrayList<Purchase> purchases =  new ArrayList<>();


    public void addItem(Purchase purchase) {
        purchases.add(purchase);
    }
}
