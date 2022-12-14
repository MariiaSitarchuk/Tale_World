import creatures.Character;
import creatures.Knight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class KnightTest {
    private Character character;

    @BeforeEach
    public void init() {
        character = new Knight();
    }

    @Test
    public void testIsClass() {
        assertTrue(character instanceof Character);
    }

    @Test
    public void testHp() {
        assertTrue(character.getHP() >= 2 && character.getHP() <= 12);
    }

    @Test
    public void testPower() {
        assertTrue(character.getPower() >= 2 && character.getPower() <= 12);
    }
}
