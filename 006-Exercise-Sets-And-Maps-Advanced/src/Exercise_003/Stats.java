package src.Exercise_003;

class Stats {
    private int damage;
    private int health;
    private int armor;

    public Stats(int damage, int health, int armor) {
        this.damage = damage;
        this.health = health;
        this.armor = armor;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getArmor() {
        return armor;
    }

    public String toString() {
        return String.format("damage: %d, health: %d, armor: %d", damage, health, armor);
    }
}