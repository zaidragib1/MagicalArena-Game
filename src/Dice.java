import java.util.Random;

public class Dice {
    private Random random;
    public Dice(){
        this.random = new Random();
    }
    //Method to simulate rolling a six-sided die
    public int roll() {
        return random.nextInt(6) + 1;
    }
}
