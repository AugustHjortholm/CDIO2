package main;

public class GameController {
    private final Dice dice;
    private final Player player1;
    private final Player player2;
    private Player activePlayer;
    private final GameBoard gameBoard;
    private boolean gameRunning;

    public GameController() {
        this.dice = new Dice();
        this.player1 = new Player("Player 1");
        this.player2 = new Player("Player 2");
        this.activePlayer = this.player1;
        this.gameBoard = new GameBoard(player1, player2);
        this.gameRunning = true;
    }

    public void play() {
        System.out.println(this.activePlayer.getName() + " starts!");

        while (gameRunning) {
            gameBoard.waitForUser();
            gameBoard.resetPlayerPositions(); // Only reset position after user rolls dice.
            this.dice.roll();
            activePlayer.getValueAccount().addToValue(gameBoard.getToFieldValue(dice.getSum()));
            this.updateActivePlayerValue();

            updateGUI();

            if (dice.getSum() == 10) {
                System.out.print("\n" + activePlayer.getName() + " gets another turn \n");
            }
            else {
                this.swapActivePlayer();
                if (checkForWin()) {
                    System.out.println(activePlayer.getName() + " has earned " + activePlayer.getValueAccount().getValue() + " in value and has won!");
                    gameRunning = false;
                }
            }
        }
    }

    private void updateGUI() {
        gameBoard.setActivePlayer(activePlayer);
        gameBoard.setDiceValue(dice.getDie1(), dice.getDie2());
        gameBoard.updateActivePlayerPosition(dice.getSum());
        gameBoard.updatePlayerValue(player1.getValueAccount().getValue(), player2.getValueAccount().getValue());
        gameBoard.displayFieldInfo(dice.getSum());
    }

    private void updateActivePlayerValue() {
        String playerName = this.activePlayer.getName();
        System.out.println(playerName + " rolled " + this.dice.getDie1() + " and " + this.dice.getDie2() + " bringing his value to " + this.activePlayer.getValueAccount().getValue() + "!");
    }

    private void swapActivePlayer() {
        if (this.activePlayer.getName().equals(this.player1.getName())) {
            this.activePlayer = this.player2;
        } else {
            this.activePlayer = this.player1;
        }
    }

    private boolean checkForWin() {
        return activePlayer.getValueAccount().getValue()>=3000;
    }
}
