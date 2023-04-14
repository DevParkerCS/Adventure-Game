public class Potion {
    String name;
    int benefit;

    public Potion(String name){
        this.name = name;
        this.benefit = 10;
    }

    public String getName() {
        return this.name;
    }

    public int getBenefit() {
        return this.benefit;
    }
}