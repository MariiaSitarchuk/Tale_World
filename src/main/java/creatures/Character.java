package creatures;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public abstract class Character { 
    private int hp; //data member (also instance variable)
    @Getter @Setter
    private int power;//data member (also instance variable)
 
//void kick(Character c), boolean isAlive()

    public void setHP(int hp) {
        this.hp = Math.max(hp, 0);
    }
    
    public int getHP() {
        return this.hp;
    }
    
    public boolean isAlive() {
        return getHP() > 0;
    }
 
    public abstract void kick(Character c);
 
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + "{" + "hp=" + hp + ", power=" + power + "}";
    }
} 
