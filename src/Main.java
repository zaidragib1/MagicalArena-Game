public class Main {
    public static void main(String[] args) {

        // Test Case 1: Anyone can win!
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);
        System.out.println("Anyone can win!");
        Game game = new Game(playerA, playerB);
        game.start();

        // Test Case 2: Making sure Player B will win!
        playerA = new Player("Player A", 50, 5, 10);
        playerB = new Player("Player B", 100, 10, 5);
        playerA.reduceHealth(50);
        game = new Game(playerA, playerB);
        System.out.println("Making sure Player B will win!");
        game.start();

        // Test Case 3: Making sure Player B will win!
        playerA = new Player("Player A", 50, 5, 10);
        playerB = new Player("Player B", 100, 10, 5);
        playerA.reduceHealth(49);
        game = new Game(playerA, playerB);
        System.out.println("Making sure Player B will win!");
        game.start();

        // Test Case 4: Making sure Player A will win!
        playerA = new Player("Player A", 50, 5, 10);
        playerB = new Player("Player B", 100, 10, 5);
        playerB.reduceHealth(100);
        System.out.println("Making sure Player A will win!");
        game = new Game(playerA, playerB);
        game.start();

        // Test Case 4: Making sure Player A will win!
        playerA = new Player("Player A", 50, 5, 10);
        playerB = new Player("Player B", 100, 10, 5);
        playerB.reduceHealth(100);
        System.out.println("Making sure Player A will win!");
        game = new Game(playerA, playerB);
        game.start();

        // Test Case 5: Making sure Player A will win!
        playerA = new Player("Player A", 50, 5, 10);
        playerB = new Player("Player B", 100, 10, 5);
        playerB.reduceHealth(99);
        System.out.println("Making sure Player A will win!");
        game = new Game(playerA, playerB);
        game.start();


    }
}