package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerJUnitTest {
    Player player;

    @BeforeEach
    void setUp() {
        player = new Player("");
    }

    @Test
    @DisplayName("Tests that score can go negative")
    void scoreCantGoNegative() {
        player.addToValue(-Integer.MAX_VALUE);
        assertEquals(player.getValue(), 0);
    }
}