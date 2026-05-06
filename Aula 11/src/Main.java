public class Main {
    public static void main(String[] args) {
        for (CustomerLevel level : CustomerLevel.values()) {
            Box box = BoxFactory.createRandomBox(level);
            box.showDetails();
        }
    }
}
