package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import game.Items.*;


public class Player {

    private Room currentRoom;
    private final ArrayList<Item> inventory;
    private int thirst;
    private int hunger;
    private int health;
    Random random = new Random();

    public Player() {
        this.inventory = new ArrayList<>();
        this.health = 100;
        this.thirst = 25;
        this.hunger = 35;
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
                requestedRoom = currentRoom.getSouthRoom();
                break;
            case EAST:
                requestedRoom = currentRoom.getEastRoom();
                break;
            case WEST:
                requestedRoom = currentRoom.getWestRoom();
                break;
        }

        if (requestedRoom != null) {
            setCurrentRoom(requestedRoom);
            return true;
        }

        return false;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        if (thirst > 100) {
            this.thirst = 100;
            return;
        } else if (thirst < 0) {
            this.thirst = 0;
            return;
        }
        this.thirst = thirst;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        if (hunger > 100) {
            this.hunger = 100;
            return;
        } else if (hunger < 0) {
            this.hunger = 0;
            return;
        }
        this.hunger = hunger;
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
            switch (item.getClass().getName()) {
                case "game.Items.Food":
                    currentRoom.addItem(new Food(item.getDescription(), item.getName(), item.getValue()));
                    break;
                case "game.Items.Drink":
                    currentRoom.addItem(new Drink(item.getDescription(), item.getName(), item.getValue()));
                    break;
                case "game.Items.Useable":
                    currentRoom.addItem(new Useable(item.getDescription(), item.getName(), item.getMessage()));
                    break;
                case "game.Items.Gun":
                    currentRoom.addItem(new Gun(item.getDescription(), item.getName(), item.getValue()));
                    break;
                case "game.Items.Melee":
                    currentRoom.addItem(new Melee(item.getDescription(), item.getName(), item.getValue()));
                    break;
                case "game.Items.Ammo":
                    Weapons ammo = (Weapons) item; //Cast to weapon, so we can use methods in the interface.
                    currentRoom.addItem(new Ammo(item.getDescription(), item.getName(), ammo.getParrent(), ammo.getAmount()));
                    break;
                case "default":
                     return false;
            }
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
            // Tjek for forskellige subklasser af Item
            if (item instanceof Food) {
                setHunger(item.getValue() + getHunger());
                message = "You ate: " + item.getName() + "\n +" + item.getValue() + "\nNew hunger stats: " + getHunger();
            } else if (item instanceof Drink) {
                setThirst(item.getValue() + getThirst());
                message = "You drank: " + item.getName() + "\n +" + item.getValue() + "\nNew thirst stats: " + getThirst();
            } else if (item instanceof Useable) {
                return item.getMessage(); // Bruger useable-objektet
            } else if (item instanceof Gun gun) {
                if (gun.Attack()) {
                    System.out.println(gun.getAmmo());
                    if (!currentRoom.getEnemies().isEmpty()) {
                        Enemy enemy = currentRoom.getEnemies().get(0);
                        int playerMiss = random.nextInt(3) + 1;
                        switch (playerMiss) {
                            case 1,2:
                                int enemyHealth = enemy.attackEnemy(gun.getValue());

                                if (enemyHealth <= 0) {
                                    message = "YOU KILLED THE ENEMY!";
                                    currentRoom.removeEnemy(enemy);
                                    return message;
                                }
                                int enemyMiss = random.nextInt(10) + 1;
                                switch (enemyMiss) {
                                    case 1,2,3,4,5,6,7,8,9:
                                        message = "You dealt " + gun.getValue() + " damage to the enemy.\nNew enemy HP: " +enemy.getHealth();
                                        break;
                                    case 10:
                                        health -= enemy.getDamage();
                                        message = "You dealt " + gun.getValue() + " damage to the enemy.\nNew enemy HP: " +enemy.getHealth() +
                                        "\nOh no! You got counter attacked - You lost " + enemy.getDamage() + " hp!\nNew HP: " + health;
                                        break;
                                }
                                return message;
                            case 3:
                                health -= enemy.getDamage();
                                return "You missed your shot and got attacked!\n You lost "+ enemy.getDamage() +
                                " hp\n New HP: " + health;
                        }
                    }
                    message = "You shot at - NOTHING";
                } else {
                    message = "There's no ammo?";
                }
                return message;
            } else if (item instanceof Melee melee) {
                if (melee.Attack()) {
                    if (!currentRoom.getEnemies().isEmpty()) {
                        Enemy enemy = currentRoom.getEnemies().get(0);
                        int playerMiss = random.nextInt(2) + 1;
                        switch (playerMiss) {
                            case 1:
                                int enemyHealth = enemy.attackEnemy(melee.getValue());

                                if (enemyHealth <= 0) {
                                    message = "YOU KILLED THE ENEMY!";
                                    currentRoom.removeEnemy(enemy);
                                    return message;
                                }
                                int enemyMiss = random.nextInt(10) + 1;
                                switch (enemyMiss) {
                                    case 1,2,3,4,5,6,7,8,9:
                                        message = "You dealt " + melee.getValue() + " damage to the enemy.\nNew enemy HP: " +enemy.getHealth();
                                        break;
                                    case 10:
                                        health -= enemy.getDamage();
                                        message = "You dealt " + melee.getValue() + " damage to the enemy.\nNew enemy HP: " +enemy.getHealth() +
                                                "\nOh no! You got counter attacked - You lost " + enemy.getDamage() + " hp!\nNew HP: " + health;
                                        break;
                                }
                                return message;
                            case 2:
                                health -= enemy.getDamage();
                                return "You missed your attack and got attacked!\n You lost "+ enemy.getDamage() +
                                        " hp\n New HP: " + health;
                        }
                    }
                    //message = "You dealt " + melee.getValue() + " damage (But there's no enemies yet)";
                }
                return message;
            } else if (item instanceof Ammo ammo) {
                for (Item item2 : inventory) {
                    if (item2.getName().equalsIgnoreCase(ammo.getParrent())) {
                        if (item2 instanceof Weapons reloadableItem) {
                            if (reloadableItem.reloadWeapon(ammo.getAmount())) {
                                message = "Reloading weapon..";
                                break;
                            }
                            message = "Not enough ammo!";
                            break;
                        }
                    }
                    message = "You don't have a " + ammo.getParrent() + "!";
                }
            } else {
                message = item.getName() +" is not useable!";
            }

            // Fjern item fra inventory, hvis det blev brugt
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {

    }
}
