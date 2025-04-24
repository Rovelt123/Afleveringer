package game;

import game.Items.*;
import java.util.ArrayList;

public class Map {
    public static final String ROOM_1 = "Outside";
    public static final String ROOM_2 = "Narrow cave";
    public static final String ROOM_3 = "Large grotto";
    public static final String ROOM_4 = "Wet cav";
    public static final String ROOM_5 = "End cave";
    public static final String ROOM_6 = "Sunny cave";
    public static final String ROOM_7 = "Mangrove cave";
    public static final String ROOM_8 = "Swamp cave";
    public static final String ROOM_9 = "Small grotto";

    //Could not find another method to use my array, but also use it into my
    //Switch case in my method 'connectRooms()'
    public static final String[] mapNames = {
            ROOM_1, ROOM_2, ROOM_3, ROOM_4, ROOM_5,
            ROOM_6, ROOM_7, ROOM_8, ROOM_9
    };

    private final String[] mapDescriptions = {
            "forrest outside a cave - the cave-entrance splits in two different directions.",
            "narrow cave that seems to bend up and down almost infinitely",
            "large grotto with an opening very far above where sunlight shines through.",
            "large dark cave - the floor is quite wet and slippery here.",
            "THIS IS THE FINAL CAVE :O!",
            "There is so much sun in here? WOA A BIG HOLE!?",
            "I must be near a swamp cave?",
            "Ew, the swamp is here! :((",
            "Why is this cave so so small?",
    };

    private Room startRoom;
    private final ArrayList<Room> rooms = new ArrayList<>();
    public void buildMap() {
        //TODO create rest of the 9 rooms in cave
        for (int i = 0; i < mapNames.length; i++) {
            String mapName = mapNames[i];
            String mapDescription = mapDescriptions[i];
            rooms.add (new Room(mapName, mapDescription));
        }
        connectRooms();

        //Add items to the rooms:
        //An usable item
        rooms.getFirst().addItem(new Useable("An old rusty flashlight", "flashlight", "Lighting up the wooooorld!"));
        rooms.getFirst().addItem(new Useable("A crinkly paper map with a big X in the middle", "map", "Find the tresure!!!"));


        // An usable item you can eat
        rooms.getFirst().addItem(new Food("a sweet apple!", "apple", 10));
        rooms.getFirst().addItem(new Food("a cookie!", "cookie", 25));

        // An usable item you can drink
        rooms.getFirst().addItem(new Drink("A waterbottle, Stay hydrated!", "water", 10));
        rooms.getFirst().addItem(new Drink("Redbull, SO ENERGIZED!!!!", "redbull", 100));

        //Weapons
        rooms.getFirst().addItem(new Gun("A small pistol", "gun", 30));
        rooms.getFirst().addItem(new Ammo("Ammunition to a small pistol", "gunammo", "gun", 16));
        rooms.getFirst().addItem(new Melee("A hard bat!", "bat", 60));

        //Enemies
        rooms.get(1).addEnemy(new Enemy(5, 50));

        //Adds 3 enemies to third room
        //Only one enemy can attack you at a time
        //They only attack you, when you attack them!
        rooms.get(2).addEnemy(new Enemy(5, 50));
        rooms.get(2).addEnemy(new Enemy(5, 150));
        rooms.get(2).addEnemy(new Enemy(5, 50));

        //An item in another room (This is a prop - not useable!)
        rooms.get(3).addItem(new Item ("a wicker bird cage", "cage"));


        startRoom = rooms.getFirst();
    }

    public Room getStartRoom() {
        return startRoom;
    }

    public void connectRooms() {
        for (int i = 0; i < rooms.size(); i++) {
            Room room = rooms.get(i);
            String roomName = room.getName();
            switch (roomName) {
                case ROOM_1: //Room 1
                    room.setEastRoom(rooms.get(i+1)); // to room 2
                    room.setSouthRoom(rooms.get(i+3)); //To room 4
                    break;
                case ROOM_2: //Room 2
                    room.setWestRoom(rooms.get(i-1)); //Back to outside
                    room.setEastRoom(rooms.get(i+1)); // To room 3
                    break;
                case ROOM_3: //Room 3
                    room.setWestRoom(rooms.get(i-1)); //Back to room 2
                    room.setSouthRoom(rooms.get(i+3)); // To room 6
                    break;
                case ROOM_4: // Room 4
                    room.setNorthRoom(rooms.get(i-3)); // Back to outside
                    room.setSouthRoom(rooms.get(i+3)); // To room 7
                    break;
                case ROOM_5: // Room 5
                    room.setWestRoom(rooms.get(i+3)); //Back to room 8
                    break;
                case ROOM_6: // Room 6
                    room.setNorthRoom(rooms.get(i-3)); //Back to room 3
                    room.setSouthRoom(rooms.get(i+3)); //
                    break;
                case ROOM_7: // Room 7
                    room.setNorthRoom(rooms.get(i-3)); //back to room 4
                    room.setEastRoom(rooms.get(i+1)); //To room 8
                    break;
                case ROOM_8: // Room 8
                    room.setNorthRoom(rooms.get(i-3)); // To room 5
                    room.setWestRoom(rooms.get(i-1)); // To room 7
                    room.setEastRoom(rooms.get(i+1)); // To room 8
                    break;
                case ROOM_9: // Room 9
                    room.setNorthRoom(rooms.get(i-3)); // Back to room 6
                    room.setWestRoom(rooms.get(i-1)); // back/to room 8
                    break;
                default:
                    System.out.println("Invalid room name: " + roomName);
                    break;
            }

        }

    }
}
