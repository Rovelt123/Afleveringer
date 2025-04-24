package game.Items;

import game.Item;

public class Drink extends Item {
    int thirst;
    public Drink(String description, int thirst) {
        super(description);
        this.thirst = thirst;
    }

    public Drink(String description, String name, int thirst) {
        super(description, name);
        this.thirst = thirst;
    }

    @Override
    public int getValue() {
        return this.thirst;
    }
}
