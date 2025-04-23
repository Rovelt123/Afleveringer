package game;

import java.util.ArrayList;

public class Map {

    private Room startRoom;
    private ArrayList<Room> rooms = new ArrayList<>();
    public void buildMap() {
        //TODO create rest of the 9 rooms in cave
        //create room and add them to a ArrayList!
        Room room1 = new Room("Outside", "forrest outside a cave - the cave-entrance splits in two different directions.");
        Room room2 = new Room("Narrow cave", "narrow cave that seems to bend up and down almost infinitely");
        Room room3 = new Room("Large grotto", "large grotto with an opening very far above where sunlight shines through.");
        Room room4 = new Room("Wet cave", "large dark cave - the floor is quite wet and slippery here.");
        Room room5 = new Room("Cave 1", "Some cave number 1.");
        Room room6 = new Room("Cave 2", "Some cave number 2.");
        Room room7 = new Room("Cave 3", "Some cave number 3");
        Room room8 = new Room("Cave 4", "Some cave number 4.");
        Room room9 = new Room("Cave 5", "Some cave number 5.");
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        rooms.add(room5);
        rooms.add(room6);
        rooms.add(room7);
        rooms.add(room8);
        rooms.add(room9);

        //TODO connect all rooms according to the specified map
        connectRooms();

        //Add items to the rooms:

        //A regular item (Can't do anything with it!)
        room1.addItem("An old rusty flashlight");

        //A regular item but you can change the name of the item
        room1.addItem("A crinkly paper map with a big X in the middle", "map");

        // An useable item you can eat
        room1.addItem("A sweet apple!", "apple", "EAT");

        // An useable item you can drink
        room1.addItem("STAY HYDRATED!", "water", "DRINK");

        // An useable item you can read
        room1.addItem("A mysterious note?", "note", "READ", "This is so cool! What should we use this for?");

        //Another item in another room
        room3.addItem("a wicker bird cage", "cage");

        //TODO Set start room to room1
        startRoom = room1;
    }

    public Room getStartRoom() {
        return startRoom;
    }

    public void connectRooms() {
        for (int i = 0; i < rooms.size(); i++) {
            Room room = rooms.get(i);
            String roomName = room.getName();
            switch (roomName) {
                case "Outside": //Room 1
                    room.setEastRoom(rooms.get(i+1)); // to room 2
                    room.setSouthRoom(rooms.get(i+3)); //To room 4
                    break;
                case "Narrow cave": //Room 2
                    room.setWestRoom(rooms.get(i-1)); //Back to outside
                    room.setEastRoom(rooms.get(i+1)); // To room 3
                    break;
                case "Large grotto": //Room 3
                    room.setWestRoom(rooms.get(i-1)); //Back to room 2
                    room.setSouthRoom(rooms.get(i+3)); // To room 6
                    break;
                case "Wet cave": // Room 4
                    room.setNorthRoom(rooms.get(i-3)); // Back to outside
                    room.setSouthRoom(rooms.get(i+3)); // To room 7
                    break;
                case "Cave 1": // Room 5
                    room.setWestRoom(rooms.get(i+3)); //Back to room 8
                    break;
                case "Cave 2": // Room 6
                    room.setNorthRoom(rooms.get(i-3)); //Back to room 3
                    room.setSouthRoom(rooms.get(i+3)); //
                    break;
                case "Cave 3": // Room 7
                    room.setNorthRoom(rooms.get(i-3)); //back to room 4
                    room.setEastRoom(rooms.get(i+1)); //To room 8
                    break;
                case "Cave 4": // Room 8
                    room.setNorthRoom(rooms.get(i-3)); // To room 5
                    room.setWestRoom(rooms.get(i-1)); // To room 7
                    room.setEastRoom(rooms.get(i+1)); // To room 8
                    break;
                case "Cave 5": // Room 9
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
