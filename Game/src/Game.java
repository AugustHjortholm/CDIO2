public class Game {
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
}
