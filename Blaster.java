public class Blaster extends Weapon {

    public Blaster(){
        super("Blaster");
        this.damage = 10;
        this.cost = 2;
    }

    public int ultimateDamage(){
        return 15;
    }
}