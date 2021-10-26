package main;

import gui_fields.GUI_Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameBoardTest {

    GameBoard gameboard;
    Player player1;
    Player player2;

    @BeforeEach
    void setUp() {
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");
        gameboard = new GameBoard(player1, player2);
    }

    @Test
    @DisplayName("Tests whether the active player has changed")
    void setActivePlayerTest() {
        gameboard.setActivePlayer(player1);
        GUI_Player activePlayer1 = gameboard.activePlayer;
        gameboard.setActivePlayer(player2);
        GUI_Player activePlayer2 = gameboard.activePlayer;
        assertNotSame(activePlayer1, activePlayer2);
    }
}