public class Player {
    private int score = 0;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void addToScore(int n) {
        this.score += n;
    }

    public int getScore() {
        return this.score;
    }

    public String getName() {
        return this.name;
    }
}

