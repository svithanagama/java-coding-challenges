package me.sanjayav.general;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FirstNonRepeatingWordTest {

    private FirstNonRepeatingWord instance;

    @BeforeEach
    public void setUp() {
        instance = new FirstNonRepeatingWord();
    }

    @Test
    public void nullInput() {
        instance.firstNonRepeatingWord(null);
    }

}