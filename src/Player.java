public class Player {
    private String name;
    private  int health;
    private int strength;
    private int attack;

    //constructor to initialise a player with given attributes
    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    //getters
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getStrength() {
        return strength;
    }
    public int getAttack() {
        return attack;
    }


    //method to apply damage to a player
    public void reduceHealth(int damage) {
        this.health = health;
        health = health - damage;
    }
    //method to check if a player is alive
    public boolean isAlive() {
        return this.health > 0;
    }

}
