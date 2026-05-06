public interface Component {
    void showDetails(int indent);
    default void showDetails() { showDetails(0); }
    default void addComponent(Component c) { throw new UnsupportedOperationException(); }
    default void removeComponent(Component c) { throw new UnsupportedOperationException(); }
}
