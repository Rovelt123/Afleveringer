import java.util.ArrayList;

public class Building {
    private ArrayList<Room> rooms;
    private int numberOfFloors;

    public Building(int numberOfFloors) {

        this.numberOfFloors = numberOfFloors;
        this.rooms = new ArrayList<Room>();

    }

    public int getNumberOfFloors() {return numberOfFloors;}

    public ArrayList<Room> getRooms() {return rooms;}

    public void addRoom(Room room) {rooms.add(room);}

}
