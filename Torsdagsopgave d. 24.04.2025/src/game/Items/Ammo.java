package game.Items;

import game.Item;

public class Ammo extends Item implements Weapons {

    String weapon;
    int amount;

    public Ammo(String description, String weapon, int amount) {
        super(description);
        this.weapon = weapon;
        this.amount = amount;
    }

    public Ammo(String description, String name, String weapon, int amount) {
        super(description, name);
        this.weapon = weapon;
        this.amount = amount;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public String getAmmo() {
        return "";
    }

    @Override
    public boolean reloadWeapon(int amount) {
        return false;
    }

    @Override
    public boolean Attack() {
        return false;
    }

    @Override
    public String getParrent() {
        return weapon;
    }
}
