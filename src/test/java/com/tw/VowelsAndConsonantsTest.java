package com.tw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VowelsAndConsonantsTest {
    @Test
    public void givenOneString_WhenCountVowels_ThenReturnCountOne() {
        VowelsAndConsonants vowelsAndConsonants = new VowelsAndConsonants("a");
        assertEquals(1, vowelsAndConsonants.count());
    }
}
