import java.util.ArrayList;

public class Menu<T, K> {
    public T item;
    public K price;

    public Menu(T item, K price) {
        this.item = item;
        this.price = price;
    }

    ArrayList<Menu> menuItems = new ArrayList<Menu>();
    public void addItem(T item, K price) {
        menuItems.add(new Menu(item, price));
    }
    public void showMenu(){
        for(Menu menu : menuItems){
            System.out.println(menu.item + ": " + menu.price);
        }


    }

}
