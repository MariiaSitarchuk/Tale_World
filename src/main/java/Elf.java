//import lombok.Override;
// check this, not sure if this is right

public class Elf extends Character {
    public Elf() {    // constructor
        super(hp: 10, power: 10);
    }
    @Override
    public void kick(Character c){
        if (c.getPower() < this.getPower()) {
            c.setHP(0);
            //c.hp = 0;
        }
        else {
            c.setPower(c.getPower() - 1);
        }
    }
}
