package game;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private Room currentRoom;
    private ArrayList<Item> inventory;

    public Player() {
        inventory = new ArrayList<>();
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room startRoom) {
        currentRoom = startRoom;
    }

    public boolean move(Direction direction) {
        Room requestedRoom = null;

        switch (direction) {
            case NORTH:
                requestedRoom = currentRoom.getNorthRoom();
                break;
            case SOUTH:
                //TODO
                requestedRoom = currentRoom.getSouthRoom();
                break;
            case EAST:
                //TODO
                requestedRoom = currentRoom.getEastRoom();
                break;
            case WEST:
                //TODO
                requestedRoom = currentRoom.getWestRoom();
                break;
        }
        // TODO if (requestedRoom != null) make currentRoom the requestedRoom;
        if (requestedRoom != null) {
            //currentRoom = requestedRoom;
            setCurrentRoom(requestedRoom);
            return true;
        }
        // TODO return whether move was possible
        return false;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public boolean takeItem(String itemName) {
        Item pickupFromRoom = currentRoom.findItem(itemName);
        if (pickupFromRoom != null) {
            inventory.add(pickupFromRoom);
            currentRoom.removeItem(pickupFromRoom);
            return true;
        }
        return false;
    }

    public boolean dropItem(String itemName) {
        Item item = findItem(itemName);
        if (item != null) {
            currentRoom.addItem(item.getDescription(), item.getName());
            // You should actually make sure it is removed from the player's
            //Inventory, so that you can't "bug" this item, but I don't think it's multiplayer (Or that you are fast enough! :'D)
            inventory.remove(item);
            return true;
        }
        return false;
    }

    public String useItem(String itemName) {
        Item item = findItem(itemName);
        String message = null;
        if (item != null) {
            if (item.getConsumable() != null) {
                switch (item.getConsumable()) {
                    case "EAT":
                        message = "You ate: " + item.getName();
                        break;
                    case "DRINK":
                        message = "You drank: " + item.getName();
                        break;
                    case "READ":
                        return item.getNote(); //No item should be removed
                    case "default":
                        message = "ERROR!";
                        break;
                }
            }
            inventory.remove(item);
        }
        return message;
    }

    private Item findItem(String itemName) {
        for (Item item : inventory) {
            if (item.getName().equals(itemName)) {
                return item;
            }
        }
        return null;
    }
}
