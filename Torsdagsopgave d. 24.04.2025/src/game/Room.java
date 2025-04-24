package game;

import java.util.ArrayList;

public class Room {
    private Room northRoom;
    private Room eastRoom;
    private Room southRoom;
    private Room westRoom;

    private final String name;
    private final String description;
    private final ArrayList<Item> items;
    private final ArrayList<Enemy> enemies;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        items = new ArrayList<>();
        enemies = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    public void removeEnemy(Enemy enemy) {
        enemies.remove(enemy);
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public Room getNorthRoom() {
        return this.northRoom;
    }

    public void setNorthRoom(Room northRoom) {
        this.northRoom = northRoom;
    }

    public Room getEastRoom() {
        return this.eastRoom;
    }

    public void setEastRoom(Room eastRoom) {
        this.eastRoom = eastRoom;
    }

    public Room getSouthRoom() {
        return southRoom;
    }

    public void setSouthRoom(Room southRoom) {
        this.southRoom = southRoom;
    }

    public Room getWestRoom() {
        return westRoom;
    }

    public void setWestRoom(Room westRoom) {
        this.westRoom = westRoom;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void removeItem(Item item) {
        //Item itemToBeRemoved = findItem(itemName);
        if (item != null) {
            items.remove(item);
        }
    }

    public Item findItem(String itemName) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
