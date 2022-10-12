//import lombok.Override;
//need to check this...

public class Hobbit extends Character {
    public Hobbit() {    // constructor
        super(hp: 3, power: 0);
    }
    @Override
    public void kick(Character c){
        System.out.println(“tears”);
    }
}

