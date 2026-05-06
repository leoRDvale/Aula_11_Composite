// src/ItemType.java
public enum ItemType {
    QUADRINHO("Quadrinho", 15.00),
    CHAVEIRO("Chaveiro", 5.00),
    BUSTO("Busto", 10.00),
    ADESIVO("Adesivo", 1.00),
    POSTER("Poster", 25.00),
    CAMISETA("Camiseta", 25.00),
    CANETA("Caneta", 3.00),
    MINIATURA("Miniatura", 20.00);

    private final String displayName;
    private final double price;

    ItemType(String displayName, double price) {
        this.displayName = displayName;
        this.price = price;
    }

    public Item toItem() {
        return new Item(displayName, price);
    }

    public String getDisplayName() { return displayName; }
    public double getPrice() { return price; }
}
