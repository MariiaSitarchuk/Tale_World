//import lombok.Override;
// CHECK THIS TOO

public class Noble extends Character {
    private static final Random randomGenerator = new Random();

    public Noble (int min, int max) {    // constructor
        super(super(randomGenerator.nextInt(bound: max-min+1) + min, randomGenerator.nextInt(bound: max-min+1) + min);
    }

    @Override
    public void kick(Character c){
        c.setHP(c.getHP() - randomGenerator.nextInt(getPower());
    }
}
