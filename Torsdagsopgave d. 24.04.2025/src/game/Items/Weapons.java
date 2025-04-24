package game.Items;

public interface Weapons {
    boolean reloadWeapon(int amount);

    boolean Attack();

    String getParrent();

    int getAmount();

    String getAmmo();

}
