public class Sword extends Weapon {

    public Sword(){
        super("sword");
        this.damage = 5;
        this.cost = 5;
    }

    public int ultimateDamage(){
        return 50;
    }
}