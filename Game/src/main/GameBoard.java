package main;

import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Street;
import gui_main.*;

import java.awt.*;

public class GameBoard {
    private GUI_Field[] fields;
    GUI_Car player1_car;
    GUI_Player player1;
    GUI_Car player2_car;
    GUI_Player player2;
    private GUI gui;

    public GameBoard(Player logic_player1, Player logic_player2) {
        fields = new GUI_Field[13]; // there are 11 fields in total
        createFields();

        player1_car = new GUI_Car();
        player1_car.setPrimaryColor(Color.red);
        player1_car.setSecondaryColor(Color.orange);
        player1 = new GUI_Player(logic_player1.getName(), logic_player1.getScore(), player1_car);

        player2_car = new GUI_Car();
        player2_car.setPrimaryColor(Color.green);
        player2_car.setSecondaryColor(Color.orange);
        player2 = new GUI_Player(logic_player2.getName(), logic_player2.getScore(), player2_car);

        gui = new GUI(fields, Color.darkGray);

        gui.addPlayer(player1);
        gui.addPlayer(player2);

        fields[0].setCar(player1, true);
        fields[0].setCar(player2, true);
    }

    public void updatePlayerPosition(Player activePlayer, int position) {

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

    private void createFields() {
        fields[0] = new GUI_Street("Start", "", "Description", "Rent", Color.red, Color.WHITE);
        fields[1] = new GUI_Street("", "", "Description", "Rent", Color.DARK_GRAY, Color.WHITE);
        fields[2] = new GUI_Street("Tower", "Subtext", "Description", "Rent", Color.DARK_GRAY, Color.WHITE);
        fields[3] = new GUI_Street("Crater", "Subtext", "Description", "Rent", Color.DARK_GRAY, Color.WHITE);
        fields[4] = new GUI_Street("Palace gates", "Subtext", "Description", "Rent", Color.DARK_GRAY, Color.WHITE);
        fields[5] = new GUI_Street("Cold desert", "Subtext", "Description", "Rent", Color.DARK_GRAY, Color.WHITE);
        fields[6] = new GUI_Street("Walled city", "Subtext", "Description", "Rent", Color.DARK_GRAY, Color.WHITE);
        fields[7] = new GUI_Street("Monastery", "Subtext", "Description", "Rent", Color.DARK_GRAY, Color.WHITE);
        fields[8] = new GUI_Street("Black cav", "Subtext", "Description", "Rent", Color.DARK_GRAY, Color.WHITE);
        fields[9] = new GUI_Street("Huts in the mountain", "Subtext", "Description", "Rent", Color.DARK_GRAY, Color.WHITE);
        fields[10] = new GUI_Street("The werewall", "Subtext", "Description", "Rent", Color.DARK_GRAY, Color.WHITE);
        fields[11] = new GUI_Street("The pit", "Subtext", "Description", "Rent", Color.DARK_GRAY, Color.WHITE);
        fields[12] = new GUI_Street("Goldmine", "Subtext", "Description", "Rent", Color.DARK_GRAY, Color.WHITE);
    }
}
