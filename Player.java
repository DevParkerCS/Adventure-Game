public class Player {
    private String name;
    private int manna;
    private int health;

    public Player(String name){
        this.name = name;
        this.manna = 100;
        this.health = 100;
    }

    public String getName() {
        return this.name;
    }

    public int getManna() {
        return this.manna;
    }


    public int getHealth() {
        return this.health;
    }

    public void sufferDamage(int damage){
        this.health = this.health - damage;
    }

    public void attack(Player opponent, Weapon weapon, boolean isUltimate) {
        if (this.manna >= weapon.cost){
            if(isUltimate){
                this.manna = 0;
                opponent.health -= weapon.ultimateDamage();
            }else{
                this.manna -= weapon.cost;
                opponent.health -= weapon.damage;
            }
        }
    }

    public void drink(Potion potion){
        if ((this.health + potion.benefit) > 100){
            this.health = 100;
        }
        else {
            this.health += potion.benefit;
        }
        potion.benefit = 0;
    }
}
