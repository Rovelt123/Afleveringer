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
        Item pickupFromRoom = currentRoom.removeItem(itemName);
        if (pickupFromRoom != null) {
            //TODO
            return true;
        }
        return false;
    }
}
