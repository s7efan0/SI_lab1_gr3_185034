import java.util.ArrayList;
import java.util.List;

public class Receipt {
    List<Item> items;

    public Receipt() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double getReceipt () {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    public double getReturnTaxAmount() {
        return items.stream().mapToDouble(Item::taxReturn).sum();
    }
}
