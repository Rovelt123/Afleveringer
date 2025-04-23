package game;

public class Map {

    private Room startRoom;

    public void buildMap() {
        //create room
        Room room1 = new Room("Outside", "forrest outside a cave - the cave-entrance splits in two different directions.");
        room1.addItem("an old rusty flashlight");
        room1.addItem("a crinkly paper map with a big X in the middle", "map");
        Room room2 = new Room("Narrow cave", "narrow cave that seems to bend up and down almost infinitely");
        Room room3 = new Room("Large grotto", "large grotto with an opening very far above where sunlight shines through.");
        room3.addItem("a wicker bird cage");
        //TODO create rest of the 9 rooms in cave
        Room room4 = new Room("Wet cave", "WET CAVE YES");

        // Connect rooms
        room1.setEastRoom(room2);
        room1.setSouthRoom(room4);


        room2.setEastRoom(room3);
        //TODO connect all rooms according to the specified map

        //TODO Set start room to room1
        startRoom = room1;
    }

    public Room getStartRoom() {
        return startRoom;
    }
}
