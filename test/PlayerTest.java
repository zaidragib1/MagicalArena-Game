import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    public void testPlayerCreation() {
        Player player = new Player("Player A", 50, 5, 10);
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());
        assertEquals("Player A", player.getName());
    }

    @Test
    public void testReduceHealth() {
        Player player = new Player("Player A", 50, 5, 10);
        player.reduceHealth(10);
        assertEquals(40, player.getHealth());
    }

    @Test
    public void testIsAlive() {
        Player player = new Player("Player A", 50, 5, 10);
        assertTrue(player.isAlive());
        player.reduceHealth(50);
        assertFalse(player.isAlive());
    }
}

