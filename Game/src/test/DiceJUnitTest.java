package test;

import main.Dice;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceJUnitTest {
    Dice dice;

    @BeforeEach
    void setUp() {
        dice = new Dice();
        dice.roll();
    }

    @Test
    @DisplayName("Average of 1000 rolls is between 6 and 8")
    void rollsAreRandom() {
        int sum = 0;
        for (int i = 0; i < 1000; ++i) {
            dice.roll();
            sum += dice.getSum();
        }
        double average = sum / 1000.0;
        assertTrue(average >= 6.0 && average <= 8.0);
    }

    @Test
    @DisplayName("Value return is the sum of die1 and die")
    void getSum() {
        int expectedResult = dice.getDie1() + dice.getDie2();
        assertEquals(expectedResult, dice.getSum());
    }
}