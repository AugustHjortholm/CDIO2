package main;

public class PlayerValueAccount {
    private int value = 1000;
    public void addToValue(int n){
        this.value += n;
        if (this.value < 0) {
            this.value = 0;
        }
    }
    public int getValue() {
        return this.value;
    }
}
