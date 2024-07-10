public class Game {
    private Player player1;
    private Player player2;
    private Dice dice;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.dice = new Dice();
    }


     // Method to start the game.
    public void start() {
        // Determine initial attacker and defender based on their health
        Player attacker = (player1.getHealth() <= player2.getHealth()) ? player1 : player2;
        Player defender = (attacker == player1) ? player2 : player1;

        // Continue the game until both the players are alive
        while (player1.isAlive() && player2.isAlive()) {
            // Attacker takes a turn
            takeTurn(attacker, defender);
            if (!defender.isAlive()) {
                System.out.println(attacker.getName() + " wins!");
                break;
            }

            // Swap roles: defender becomes attacker and attacker becomes defender
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }
    }

    // Method to handle a turn where one player attacks and the other defends
    private void takeTurn(Player attacker, Player defender) {
        // Roll dice for attack and defense
        int attackRoll = dice.roll();
        int defenseRoll = dice.roll();

        // Calculate attack damage and defense strength
        int attackDamage = attacker.getAttack() * attackRoll;
        int defenseStrength = defender.getStrength() * defenseRoll;

        // Calculate damage dealt after accounting for defense
        int damageDealt = attackDamage - defenseStrength;
        if (damageDealt > 0) {
            defender.reduceHealth(damageDealt);
        }
    }



}



