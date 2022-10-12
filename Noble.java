//import lombok.Override;
// CHECK THIS TOO

public class Noble extends Character {
    private static final Random randomGenerator = new Random();

    public Noble (int min, int max) {    // constructor
        super(super(hp: randomGenerator.nextInt(bound: max-min+1) + min, power: randomGenerator.nextInt(bound: max-min+1) + min);
    }

    @Override
    public void kick(Character c){
        c.setHP(c.getHP() - randomGenerator.nextInt(getPower());
    }
}
