import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private int die1;
    private int die2;

    public Dice() {
        this.roll();
    }

    public void roll() {
        this.die1 = ThreadLocalRandom.current().nextInt(1, 7);
        this.die2 = ThreadLocalRandom.current().nextInt(1, 7);
    }

    public int getSum() {
        return this.die1 + this.die2;
    }

    public int getDie1() {
        return this.die1;
    }

    public int getDie2() {
        return this.die2;
    }

    public void setDie1(int die1) {
        this.die1 = die1;
    }

    public void setDie2(int die2) {
        this.die2 = die2;
    }
}

