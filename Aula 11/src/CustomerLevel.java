public enum CustomerLevel {
    BRONZE(3),
    PRATA(5),
    OURO(7),
    PLATINA(10);

    private final int itemLimit;

    CustomerLevel(int itemLimit) {
        this.itemLimit = itemLimit;
    }

    public int getItemLimit() { return itemLimit; }
}
