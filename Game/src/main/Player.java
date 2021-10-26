package main;

public class Player {
    private int value = 1000;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void addToValue(int n) {
        this.value += n;
        if (this.value < 0) {
            this.value = 0;
        }
    }

    public int getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }
}

