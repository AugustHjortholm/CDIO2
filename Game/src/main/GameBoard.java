package main;

import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Street;
import gui_main.*;

import java.awt.*;

public class GameBoard {
    private GUI_Field[] fields;
    private GUI gui;

    public GameBoard() {
        fields = new GUI_Field[11]; // there are 11 fields in total
        createFields();
        gui = new GUI(fields, Color.darkGray);
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
        fields[0] = new GUI_Street("Tower", "Subtext", "Description", "Rent", Color.DARK_GRAY, Color.WHITE);
        fields[1] = new GUI_Street("Crater", "Subtext", "Description", "Rent", Color.DARK_GRAY, Color.WHITE);
        fields[2] = new GUI_Street("Palace gates", "Subtext", "Description", "Rent", Color.DARK_GRAY, Color.WHITE);
        fields[3] = new GUI_Street("Cold desert", "Subtext", "Description", "Rent", Color.DARK_GRAY, Color.WHITE);
        fields[4] = new GUI_Street("Walled city", "Subtext", "Description", "Rent", Color.DARK_GRAY, Color.WHITE);
        fields[5] = new GUI_Street("Monastery", "Subtext", "Description", "Rent", Color.DARK_GRAY, Color.WHITE);
        fields[6] = new GUI_Street("Black cav", "Subtext", "Description", "Rent", Color.DARK_GRAY, Color.WHITE);
        fields[7] = new GUI_Street("Huts in the mountain", "Subtext", "Description", "Rent", Color.DARK_GRAY, Color.WHITE);
        fields[8] = new GUI_Street("The werewall", "Subtext", "Description", "Rent", Color.DARK_GRAY, Color.WHITE);
        fields[9] = new GUI_Street("The pit", "Subtext", "Description", "Rent", Color.DARK_GRAY, Color.WHITE);
        fields[10] = new GUI_Street("Goldmine", "Subtext", "Description", "Rent", Color.DARK_GRAY, Color.WHITE);
    }
}
