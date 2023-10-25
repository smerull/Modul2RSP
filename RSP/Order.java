import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items = new ArrayList<>();

    public void calculateTotalSum() {
       
    }

    public List<Item> getItems() {
        return items;
    }

    public int getItemCount() {
        return items.size();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void deleteItem(Item item) {
        items.remove(item);
    }
}