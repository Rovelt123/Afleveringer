package game;


public class Adventure {

    private Map map;
    private Player player;
    private UserInterface ui = new UserInterface();

    public Adventure() {
        map = new Map();
        map.buildMap();
        player = new Player();
        player.setCurrentRoom(map.getStartRoom());
    }

    public void startGame() {
        boolean gameRunning = true;
        ui.printWelcome();
        showDirections();

        while (gameRunning) {
            String[] commandString = ui.readInput();
            String firstWord = commandString[0];
            String secondWord = "";
            if (commandString.length > 1) {
                secondWord = commandString[1];
            }

            switch (firstWord) {
                case "inv":
                case "invent":
                case "inventory":
                    ui.showInventory(player);
                    break;
                case "look":
                    ui.describeRoom(player.getCurrentRoom());
                    break;
                case "help":
                case "info":
                    ui.showHelp();
                    break;
                case "quit":
                case "exit":
                case "bye":
                    gameRunning = false;
                    ui.printMessage("Thank you for playing Adventure");
                    break;
                case "go":
                    if (secondWord.isEmpty()) {
                        ui.printMessage("You need to enter a direction!");
                        break;
                    }
                    Direction direction = parseCommand(commandString[1]);
                    goCommand(direction);
                    break;
                case "take":
                    if (player.takeItem(secondWord)) {
                        ui.printMessage("You took 1x " + secondWord);
                    } else {
                        ui.printMessage("There is nothing like " + secondWord + " to take around here.");
                    }
                    break;
                case "drop":
                    if (player.dropItem(secondWord)) {
                        ui.printMessage("You have dropped " + secondWord + " into " + player.getCurrentRoom()+ "!");
                    } else {
                        ui.printMessage("Seems like you don't have " + secondWord + " to drop!");
                    }
                    break;
                case "use":
                    String usedItem = player.useItem(secondWord);
                    if (usedItem != null) {
                        ui.printMessage(usedItem);
                    } else {
                        ui.printMessage(secondWord + " is not a useable item!");
                    }
                    break;
                case "dir":
                case "direction":
                    showDirections();
                    break;
                default:
                    ui.printMessage("I do not understand that command.");
            }
        }
    }

    public void goCommand(Direction direction) {
        if (goDirection(direction)) {
            Room currentRoom = getCurrentRoom();
            String name = currentRoom.getName();
            String line = "-".repeat(name.length());
            ui.printMessage(line + "\n" + name + "\n" + line);
            ui.describeRoom(currentRoom);
            Main.Sleep(3);
            showDirections();
        } else {
            ui.printMessage("You cannot go in that direction");
        }
    }

    private Direction parseCommand(String word) {
        Direction requestedDirection = null;
        switch (word) {
            case "n", "north":
                requestedDirection = Direction.NORTH;
                break;
            case "s", "south":
                requestedDirection = Direction.SOUTH;
                break;
            case "e", "east":
                requestedDirection = Direction.EAST;
                break;
            case "w", "west":
                requestedDirection = Direction.WEST;
                break;
        }
        return requestedDirection;
    }

    public boolean goDirection(Direction direction) {
        return player.move(direction);
    }

    public Room getCurrentRoom() {
        return player.getCurrentRoom();
    }

    public void showDirections() {
        if (getCurrentRoom().getNorthRoom() != null || getCurrentRoom().getWestRoom() != null || getCurrentRoom().getNorthRoom() != null || getCurrentRoom().getEastRoom() != null || getCurrentRoom().getSouthRoom() != null) {
            ui.printMessage("\nYou can go the following ways (USE \"GO\"):");
        }
        if (getCurrentRoom().getNorthRoom() != null) {
            ui.printMessage("NORTH");
        }
        if (getCurrentRoom().getWestRoom() != null) {
            ui.printMessage("WEST");
        }
        if (getCurrentRoom().getEastRoom() != null) {
            ui.printMessage("EAST");
        }
        if (getCurrentRoom().getSouthRoom() != null) {
            ui.printMessage("SOUTH");
        }
    }
}
