import java.util.ArrayList;
import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
        Building myBuilding = new Building(3);
        // Har lavet et loop hvor den automatisk tilføjer 3 rum med et random nummber vinduer og lamper.
        for (int i = 0; i < 3; i++) {
            int numberOfLamps = 1 + (int) (random() * 10);
            int numberOfWindows = 1 + (int) (random() * 10);
            myBuilding.addRoom(new Room(numberOfLamps, numberOfWindows));
        }
        //Eller manuelt tilføje rum her:
        /*Room room1 = new Room(10, 2);
        Room room2 = new Room(15, 1);
        Room room3 = new Room(12, 1);
        myBuilding.addRoom(room1);
        myBuilding.addRoom(room2);
        myBuilding.addRoom(room3);*/

        int widowsInBuilding = countWindowsInBuilding(myBuilding.getRooms());
        int lampsInBuilding = countLampsInBuilding(myBuilding.getRooms());
        int roomsInBuilding = countRoomsInBuilding(myBuilding.getRooms());
        boolean buildingState = isNormal(myBuilding, roomsInBuilding);


        System.out.println("\nThere are " +roomsInBuilding+ " rooms in the building");
        System.out.println("\nThere are " +widowsInBuilding+ " windows in the building");
        System.out.println("\nThere are " +lampsInBuilding+ " lamps in the building");
        System.out.println("\nThe building is " + (buildingState ? "normal" : "not normal"));

    }

    public static int countLampsInBuilding(ArrayList<Room> rooms) {

        int numberOfLamps = 0;
        for (Room room : rooms) {
            numberOfLamps += room.getNumberOfLamps();
        }
        return numberOfLamps;

    }


    public static int countWindowsInBuilding(ArrayList<Room> rooms) {

        int numberOfWindows = 0;
        for (Room room : rooms) {
            numberOfWindows += room.getNumberOfWindows();
        }
        return numberOfWindows;

    }

    public static int countRoomsInBuilding(ArrayList<Room> rooms) {return rooms.size();}

    public static boolean isNormal(Building building, int numberOfRooms) {return building.getNumberOfFloors() <= numberOfRooms;}
}