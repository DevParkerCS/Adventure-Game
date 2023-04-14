public class Weapon {
    String name;
    int damage;
    int cost;

    public Weapon(String name){
        this.name = name;
        this.damage = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getDamage() {
        return this.damage;
    }

    public int getCost() {
        return this.cost;
    }

    public int ultimateDamage() {
        return 0;
    }
}