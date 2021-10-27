package main;

import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Street;
import gui_main.*;

import java.awt.*;

public class GameBoard {
    private Language language;
    private GUI_Field[] fields;
    GUI_Car player1_car;
    GUI_Player player1;
    GUI_Car player2_car;
    GUI_Player player2;
    GUI_Player activePlayer;
    private GUI gui;

    public GameBoard(Player logic_player1, Player logic_player2, PlayerValueAccount value_player1, PlayerValueAccount value_player2) {
        language = new English();
        fields = new GUI_Field[13]; // there are 11 fields in total
        createFields();

        player1_car = new GUI_Car();
        player1_car.setPrimaryColor(Color.red);
        player1_car.setSecondaryColor(Color.orange);
        player1 = new GUI_Player(logic_player1.getName(), value_player1.getValue(), player1_car);

        player2_car = new GUI_Car();
        player2_car.setPrimaryColor(Color.green);
        player2_car.setSecondaryColor(Color.orange);
        player2 = new GUI_Player(logic_player2.getName(), value_player2.getValue(), player2_car);

        activePlayer = player1;

        gui = new GUI(fields, Color.darkGray);

        gui.addPlayer(player1);
        gui.addPlayer(player2);

        fields[0].setCar(player1, true);
        fields[0].setCar(player2, true);
    }

    public void setActivePlayer(Player player) {
        if (player.getName().equals(player1.getName())) {
            activePlayer = player1;
        } else { // Assuming its player2 if it's not player1... maybe we should do some error handling?
            activePlayer = player2;
        }
    }

    public void updateActivePlayerPosition(int position) {
        moveActivePlayerForward(position);
        //fields[position].setCar(activePlayer, true); // Assuming position will only be in range 2..12... Dice shouldn't be able to roll anything else, but maybe some error handling is appropriate.
    }
    
    public void resetPlayerPositions() {
        // Have to iterate over each field. Weird design?
        for (var field:
             fields) {
            field.removeAllCars();
        }

        fields[0].setCar(player1, true);
        fields[0].setCar(player2, true);
    }
    
    public void setDiceValue(int die1, int die2) {
        gui.setDice(die1, die2);
    }

    public void updatePlayerValue(int playerOneValue, int playerTwoValue) {
        player1.setBalance(playerOneValue);
        player2.setBalance(playerTwoValue);
    }

    public int getToFieldValue(int field){
        return switch (field) {
            case 2 -> 250;
            case 3 -> -100;
            case 4 -> 100;
            case 5 -> -20;
            case 6 -> 180;
            case 7 -> 0;
            case 8 -> -70;
            case 9 -> 60;
            case 10 -> -80;
            case 11 -> -50;
            case 12 -> 650;
            default -> 0;
        };
    }

    public void waitForUser() {
        gui.getUserButtonPressed("", "Roll dice");
    }

    private void moveActivePlayerForward(int steps) {
        int current_pos = 0; // Activeplayer will always start at position 0 when beginning to move

        while (current_pos < steps) {
            fields[current_pos].removeAllCars(); // Need to replace the non moving car

            if (current_pos == 0) { // Replace the nonactive player car as it is removed along with the active one
                fields[current_pos].setCar(activePlayer.getName().equals(player1.getName()) ? player2 : player1, true);
            }

            fields[current_pos + 1].setCar(activePlayer, true);
            ++current_pos;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Using chance card to display messages as its there anyway and I think it looks nice.
    public void displayMessage(String message) {
        gui.displayChanceCard(message);
    }

    private void createFields() {
        for (int i = 0; i < 13; i++) {
            fields[i] = new GUI_Street(language.getFieldTitle(i), language.getFieldSubtexts(i), language.getFieldDescriptions(i), language.getFieldRents(i), Color.darkGray, Color.white);
        }
    }
}
