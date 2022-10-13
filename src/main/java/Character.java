import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class Character
{ 
    @Getter @Setter
    private int power;//data member (also instance variable)
    @Getter
    private int hp; //data member (also instance variable) 
 
//void kick(Character c), boolean isAlive()
    public void setHP(int hp) {
        this.hp = Math.max(hp, 0);
    }
    
    public boolean isAlive() {
        return getHP() > 0;
    }
 
    public abstract void kick(Character c);
 
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + “{” + “hp=” + hp + “, power=” + power + “}”;
} 
