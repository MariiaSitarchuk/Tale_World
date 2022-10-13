package creators;

import creatures.Character;
import creatures.Hobbit;

public class GameManager {
  
    public static void fight(Character c1, Character c2) { 
        /**
        * to provide fight between to characters and explain via command 
        * line what happens during fight, till both of 
        * the characters are alive 
        */

        int rounds = 0;

        System.out.println("First character data: " + c1.toString());
        System.out.println("Second character data: " + c2.toString());

        if (c1 instanceof Hobbit && c2 instanceof Hobbit) {
           System.out.println("Two Hobbits'll die in their own tears");
           return;
        }

        while (c1.isAlive() && c2.isAlive()) {
            rounds++;
            if (rounds % 2 != 0) {
                System.out.println("Round " + rounds);
                System.out.println("First character is attacking");
                c1.kick(c2);
            }
            else {
                System.out.println("Second character is attacking");
                c2.kick(c1);
            }
            System.out.println("Result of this attack:");
            System.out.println("First character: " + c1.toString());
            System.out.println("Second character: " + c2.toString());
        }
        
        System.out.println("Number of rounds played: " + intCeil(rounds, 2));

        if (c1.isAlive()) {
            System.out.println("First character won!!!");
        }
        else if (c2.isAlive()) {
            System.out.println("Second character won!!!");
        }
        else {
            System.out.println("Ooops, two bodies right here...");
        }
    }

    public static int intCeil(int a, int b) {
        if (a % b != 0) {
            return (a / b) + 1;
        }
        else {
            return (a / b);
        }
    }

    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        Character first_creature = factory.createCharacter();
        Character second_creature = factory.createCharacter();
        fight(first_creature, second_creature);
    }
}
