package game;

public class Item {
    private String name;
    private String description;
    private String consumable;
    private String note;

    public Item(String description) {
        // grab name as the last word of the description
        this(description,description.substring(description.lastIndexOf(' ')+1), null, null);
    }

    public Item(String description, String name) {
        this(description, name, null, null);
    }

    public Item(String description, String name, String useAble) {
        this(description, name, useAble, null);
    }

    public Item(String description, String name, String useAble, String note) {
        this.name = name;
        this.description = description;
        this.consumable = useAble;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getConsumable() {
        return consumable;
    }

    public String getNote() {
        return note;
    }

    @Override
    public String toString() {
        return description;
    }
}
