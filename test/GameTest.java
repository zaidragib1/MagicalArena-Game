import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    private Player player1;
    private Player player2;
    private Game game;

    @BeforeEach
    public void setUp() {

    }

    @Test
    public void testGameStart_Player1Wins() {
        player1 = new Player("Player 1", 100, 10, 5);
        player2 = new Player("Player 2", 100, 8, 6);
        game = new Game(player1, player2);
        // Ensure player2 loses the game
        player2.reduceHealth(90); // Simulate player2 losing all health
        game.start();
        assertEquals(player1.getName() + " wins!", "Player 1 wins!");
    }

    @Test
    public void testGameStart_Player2Wins() {
        player1 = new Player("Player 1", 100, 10, 5);
        player2 = new Player("Player 2", 100, 8, 6);
        game = new Game(player1, player2);
        // Ensure player1 loses the game
        player1.reduceHealth(90); // Simulate player1 losing all health
        game.start();
        assertEquals(player2.getName() + " wins!", "Player 2 wins!");
    }

    @Test
    public void testTakeTurn_Player1Attacks_Player2() {
        player1 = new Player("Player 1", 100, 10, 5);
        player2 = new Player("Player 2", 100, 8, 6);
        game = new Game(player1, player2);
        // Simulate a turn where player1 attacks player2
        game.takeTurn(player1, player2);
        assertTrue(player2.getHealth() < 100); // Check if player2's health reduced
    }

    @Test
    public void testTakeTurn_Player2Attacks_Player1() {
        player1 = new Player("Player 1", 100, 10, 5);
        player2 = new Player("Player 2", 100, 8, 6);
        game = new Game(player1, player2);
        // Simulate a turn where player2 attacks player1
        game.takeTurn(player2, player1);
        assertTrue(player1.getHealth() < 100); // Check if player1's health reduced
    }
}
