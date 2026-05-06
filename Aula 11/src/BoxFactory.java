import java.util.concurrent.ThreadLocalRandom;

public class BoxFactory {
    public static Box createRandomBox(CustomerLevel level) {
        Box box = new Box(level);
        ItemType[] types = ItemType.values();
        int limit = level.getItemLimit();
        ThreadLocalRandom rnd = ThreadLocalRandom.current();

        for (int i = 0; i < limit; i++) {
            ItemType chosen = types[rnd.nextInt(types.length)];
            box.addItem(chosen.toItem());
        }
        return box;
    }
}
