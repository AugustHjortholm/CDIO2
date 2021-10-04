import java.util.Scanner;

public class Game {
    private Dice dice = new Dice();
    private Player player1 = new Player("Player1");
    private Player player2 = new Player("Player2");
    private Player activePlayer;
    private boolean player1Won;
    private boolean hasInputCheck = true;

    public Game() {
        this.activePlayer = this.player1;
    }

    public void play() {
        System.out.println(this.activePlayer.getName() + " starts!");

        while (true) {
            String code = this.waitForInput();
            this.dice.roll();
            updateActivePlayerScore();

            if (this.hasPlayerWon(this.activePlayer)) {
                System.out.println(this.activePlayer.getName() + " wins!");
                setPlayer1Won(this.activePlayer);
                return;
            }
        }
    }

    private void setPlayer1Won(Player player) {
        if (player.getName().equals("Player1")) {
            player1Won = true;
        } else {
            player1Won = false;
        }
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
        return false; //TEMP
    }

    private String waitForInput() {
        if (hasInputCheck) {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        } else {
            return ("");
        }
    }

    public void setHasInputCheck(boolean hasInputCheck) {
        this.hasInputCheck = hasInputCheck;
    }
}
