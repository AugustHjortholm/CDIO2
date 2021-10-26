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

    @Test
    @DisplayName("Tests if the correct value is added to the score when 2 is rolled")
    void getFieldValueOnRoll2Test() {
        assertEquals(gameboard.getToFieldValue(2),250);
    }

    @Test
    @DisplayName("Tests if the correct value is added to the score when 3 is rolled")
    void getFieldValueOnRoll3Test() {
        assertEquals(gameboard.getToFieldValue(3),-100);
    }

    @Test
    @DisplayName("Tests if the correct value is added to the score when 4 is rolled")
    void getFieldValueOnRoll4Test() {
        assertEquals(gameboard.getToFieldValue(4),100);
    }

    @Test
    @DisplayName("Tests if the correct value is added to the score when 5 is rolled")
    void getFieldValueOnRoll5Test() {
        assertEquals(gameboard.getToFieldValue(5),-20);
    }

    @Test
    @DisplayName("Tests if the correct value is added to the score when 6 is rolled")
    void getFieldValueOnRoll6Test() {
        assertEquals(gameboard.getToFieldValue(6),180);
    }

    @Test
    @DisplayName("Tests if the correct value is added to the score when 7 is rolled")
    void getFieldValueOnRoll7Test() {
        assertEquals(gameboard.getToFieldValue(7),0);
    }

    @Test
    @DisplayName("Tests if the correct value is added to the score when 8 is rolled")
    void getFieldValueOnRoll8Test() {
        assertEquals(gameboard.getToFieldValue(8),-70);
    }

    @Test
    @DisplayName("Tests if the correct value is added to the score when 9 is rolled")
    void getFieldValueOnRoll9Test() {
        assertEquals(gameboard.getToFieldValue(9),60);
    }

    @Test
    @DisplayName("Tests if the correct value is added to the score when 10 is rolled")
    void getFieldValueOnRoll10Test() {
        assertEquals(gameboard.getToFieldValue(10),-80);
    }

    @Test
    @DisplayName("Tests if the correct value is added to the score when 11 is rolled")
    void getFieldValueOnRoll11Test() {
        assertEquals(gameboard.getToFieldValue(11),-50);
    }

    @Test
    @DisplayName("Tests if the correct value is added to the score when 12 is rolled")
    void getFieldValueOnRoll12Test() {
        assertEquals(gameboard.getToFieldValue(12),650);
    }


}