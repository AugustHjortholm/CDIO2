import java.util.Scanner;

public class Game_Controller {
    private Dice dice = new Dice();
    private Player player1 = new Player("Player1");
    private Player player2 = new Player("Player2");
    private Player activePlayer;
    private Game gameBoard;

    public Game_Controller() {
        this.activePlayer = this.player1;
        this.gameBoard = new Game();
    }

    public void play() {
        System.out.println(this.activePlayer.getName() + " starts!");

        while (true) {
            this.dice.roll();
            activePlayer.addToScore(gameBoard.addToScore(this.dice.getSum()));
            this.updateActivePlayerScore();
            this.swapActivePlayer();
        }
    }

    private void updateActivePlayerScore() {
        String playerName = this.activePlayer.getName();
        System.out.println(playerName + " rolled " + this.dice.getDie1() + " and " + this.dice.getDie2() + " bringing his score to " + this.activePlayer.getScore() + "!");
    }

    private void swapActivePlayer() {
        if (this.activePlayer.getName().equals(this.player1.getName())) {
            this.player1 = this.activePlayer;
            this.activePlayer = this.player2;
        } else {
            this.player2 = this.activePlayer;
            this.activePlayer = this.player1;
        }
    }
}
