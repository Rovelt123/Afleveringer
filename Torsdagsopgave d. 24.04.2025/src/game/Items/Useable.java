package game.Items;

import game.Item;

public class Useable extends Item {
    String message;
    public Useable(String description, String message) {
        super(description);
        this.message = message;
    }

    public Useable(String description, String name, String message) {
        super(description, name);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
