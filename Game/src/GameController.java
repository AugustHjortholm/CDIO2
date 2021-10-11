import java.util.Scanner;

public class GameController {
    private Dice dice = new Dice();
    private Player player1 = new Player("Player1");
    private Player player2 = new Player("Player2");
    private Player activePlayer;
    private Game gameBoard;
    private boolean gameRunning = true;
    private Scanner scan = new Scanner(System.in);

    public GameController() {
        this.activePlayer = this.player1;
        this.gameBoard = new Game();
    }

    public void play() {
        System.out.println(this.activePlayer.getName() + " starts!");

        while (gameRunning) {
            scan.nextLine();
            this.dice.roll();
            activePlayer.addToScore(gameBoard.getToFieldValue(this.dice.getSum()));
            this.updateActivePlayerScore();
            this.swapActivePlayer();
            if(checkForWin()) {
                System.out.println(activePlayer.getName() + " has earned " + activePlayer.getScore() + " points and has won!");
                gameRunning = false;
            }
        }
    }

    private void updateActivePlayerScore() {
        String playerName = this.activePlayer.getName();
        System.out.println(playerName + " rolled " + this.dice.getDie1() + " and " + this.dice.getDie2() + " bringing his score to " + this.activePlayer.getScore() + "!");
    }

    private void swapActivePlayer() {
        if (this.activePlayer.getName().equals(this.player1.getName())) {
            this.activePlayer = this.player2;
        } else {
            this.activePlayer = this.player1;
        }
    }

    private boolean checkForWin() {
        return activePlayer.getScore()>=3000;
    }
}
