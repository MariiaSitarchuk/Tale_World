package java;

public class Elf extends Character {
    public Elf() {    // constructor
        super(10, 10);
    }
    @Override
    public void kick(Character c){
        if (c.getPower() < this.getPower()) {
            c.setHP(0);
        }
        else {
            c.setPower(c.getPower() - 1);
        }
    }
}
