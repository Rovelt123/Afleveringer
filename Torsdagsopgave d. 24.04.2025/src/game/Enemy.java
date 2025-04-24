package game;

public class Enemy {
    int health;
    int damage;
    Enemy(int damage, int health) {
        this.damage = damage;
        this.health = health;
    }

    public int attackEnemy(int tmpDamage) {
        health -= tmpDamage;
        return health;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

}
