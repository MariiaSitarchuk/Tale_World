package creatures;

public class Hobbit extends Character {
    public Hobbit() {    // constructor
        super(3, 0);
    }
    @Override
    public void kick(Character c){
        System.out.println("tears falling down");
    }
}
