public class GameManager {
    //CharacterFactory factory = new CharacterFactory();
    //Character first_player = factory.createCharacter();
    //Character second_player = factory.createCharacter();
    private int rounds = 1;
  
    public void fight(Character c1, Character c2) { 
         /**
         * to provide fight between to characters and explain via command 
         * line what happens during fight, till both of 
         * the characters are alive 
         */
         System.out.println("First character: " + c1.toString());
         System.out.println("Second character: " + c2.toString());
      
         while (c1.isAlive() && c2.isAlive()) {
             if (rounds % 2 != 0) {
                 System.out.println("First character is attacking");
                 c1.kick(c2);
             }
             else {
                 System.out.println("Second character is attacking");
                 c2.kick(c1);
             }
             System.out.println("Result of this round:");
             System.out.println("First character: " + c1.toString());
             System.out.println("Second character: " + c2.toString());
             rounds++;
         }

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
}
