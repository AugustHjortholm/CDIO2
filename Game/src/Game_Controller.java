import java.util.Scanner;

public class Game_Controller {
    private Dice dice = new Dice();
    private Player player1 = new Player("Player1");
    private Player player2 = new Player("Player2");
    private Player activePlayer;
    private Game gameBoard;
    private boolean player1Won;
    private boolean hasInputCheck = true;

    public Game_Controller() {
        this.activePlayer = this.player1;
        this.gameBoard = new Game();
    }

    public void play() {
        System.out.println(this.activePlayer.getName() + " starts!");

        while (true) {
            String code = this.waitForInput();
            this.dice.roll();
            activePlayer.addToScore(gameBoard.addToScore(this.dice.getSum()));
            this.updateActivePlayerScore();
            this.swapActivePlayer();

            if (this.hasPlayerWon(this.activePlayer)) {
                System.out.println(this.activePlayer.getName() + " wins!");
                setPlayer1Won(this.activePlayer);
                return;
            }
        }
    }

    private void setPlayer1Won(Player player) {
        player1Won = player.getName().equals("Player1");
    }

    public boolean isPlayer1Won() {
        return player1Won;
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

    private boolean hasPlayerWon(Player player) {
        return false;
    }

    private String waitForInput() {
        if (hasInputCheck) {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        } else {
            return ("");
        }
    }
    //May be needed for later
    public void setHasInputCheck(boolean hasInputCheck) {
        this.hasInputCheck = hasInputCheck;
    }
}
