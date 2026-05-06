import java.util.ArrayList;
import java.util.List;

public class Box {
    private final CustomerLevel level;
    private final List<Item> items = new ArrayList<>();

    public Box(CustomerLevel level) {
        this.level = level;
    }

    public void addItem(Item item) {
        if (items.size() < level.getItemLimit()) {
            items.add(item);
        }
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }

    public double getTotalPrice() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    public void showDetails() {
        System.out.println("Caixa - Nível: " + level.name() + " (limite: " + level.getItemLimit() + " itens)");
        if (items.isEmpty()) {
            System.out.println("  (vazia)");
        } else {
            for (int i = 0; i < items.size(); i++) {
                System.out.println("  " + (i + 1) + ". " + items.get(i));
            }
        }
        System.out.println("Valor total: R$ " + String.format("%.2f", getTotalPrice()));
        System.out.println("-----");
    }
}
