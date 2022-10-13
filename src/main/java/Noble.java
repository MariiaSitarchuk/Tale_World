package java;

import java.util.Random;

public abstract class Noble extends Character {
    private static final Random randomGenerator = new Random();

    public Noble (int min, int max) {    // constructor
        super(randomGenerator.nextInt(max-min+1) + min, randomGenerator.nextInt(max-min+1) + min);
    }

    @Override
    public void kick(Character c){
        c.setHP(c.getHP() - randomGenerator.nextInt(this.getPower());
    }
}
