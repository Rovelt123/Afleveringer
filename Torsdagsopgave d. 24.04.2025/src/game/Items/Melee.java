package game.Items;

import game.Item;

public class Melee extends Item implements Weapons {
    int damage;
    public Melee(String description, String name, int damage) {
        super(description, name);
        this.damage = damage;
    }

    public Melee(String description, int damage) {
        super(description);
        this.damage = damage;
    }

    @Override
    public boolean reloadWeapon(int amount) {
        return false;
    }

    @Override
    public boolean Attack() {
        //TODO
        //Do damage here!
        return true;
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
    public String getAmmo() {
        return "";
    }

    @Override
    public int getValue() {
        return damage;
    }
}
