package game.Items;

import game.Item;

public class Gun extends Item implements Weapons {
    int ammo;
    //int magazine;
    int damage;
    public Gun(String description, String name, int damage) {
        super(description, name);
        this.damage = damage;
        ammo = 16;
    }

    public Gun(String description, int damage) {
        super(description);
        this.damage = damage;
        reloadWeapon(16);
    }

    @Override
    public boolean reloadWeapon(int amount) {
        if (amount > 15 ) {
            ammo = amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean Attack() {
        if (ammo > 0) {
            ammo--;
            //TODO
            //Do damage here!
            return true;
        }
        return false;
    }


    @Override
    public String getParrent() {
        return "";
    }

    @Override
    public int getAmount() {
        return 0;
    }

    @Override
    public int getValue() {
        return damage;
    }

    @Override
    public String getAmmo() {
        return "You have " + ammo + " left!";
    }
}
