public class File implements Component {
    private final String name;
    public File(String name) { this.name = name; }
    @Override
    public void showDetails(int indent) {
        System.out.println(" ".repeat(indent) + "- " + name);
    }
}
