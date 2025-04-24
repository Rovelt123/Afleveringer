package game.Items;
import game.Item;

public class Food extends Item {
    int hunger;
    public Food(String description, int hunger) {
        super(description);
        this.hunger = hunger;
    }

    public Food(String description, String name, int hunger) {
        super(description, name);
        this.hunger = hunger;
    }

    @Override
    public int getValue() {
        return this.hunger;
    }
}
