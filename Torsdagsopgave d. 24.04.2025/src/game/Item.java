package game;

public class Item {
    private final String name;
    private final String description;

    public Item(String description) {
        // grab name as the last word of the description
        this(description,description.substring(description.lastIndexOf(' ')+1));
    }

    public Item(String description, String name) {
        this.description = description;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getMessage() {
        return "Generic item message";
    }

    public int getValue() {
        return 0;
    }


    @Override
    public String toString() {
        return description;
    }
}
