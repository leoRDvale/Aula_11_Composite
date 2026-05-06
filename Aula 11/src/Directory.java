import java.util.ArrayList;
import java.util.List;

public class Directory implements Component {
    private final String name;
    private final List<Component> children = new ArrayList<>();
    public Directory(String name) { this.name = name; }
    @Override
    public void addComponent(Component c) { children.add(c); }
    @Override
    public void removeComponent(Component c) { children.remove(c); }
    @Override
    public void showDetails(int indent) {
        System.out.println(" ".repeat(indent) + "+ " + name);
        for (Component c : children) c.showDetails(indent + 2);
    }
}
