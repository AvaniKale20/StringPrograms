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

    @Test
    public void givenOneString_WhenCountVowels_ThenReturnCountTwo() {
        VowelsAndConsonants vowelsAndConsonants = new VowelsAndConsonants("avi");
        assertEquals(2, vowelsAndConsonants.count());
    }

    @Test
    public void givenOneString_WhenCountVowels_ThenReturnCountSix() {
        VowelsAndConsonants vowelsAndConsonants = new VowelsAndConsonants("updated resume");
        assertEquals(6, vowelsAndConsonants.count());
    }
    @Test
    public void givenOneString_WhenCountConsonants_ThenReturnCountOne() {
        VowelsAndConsonants vowelsAndConsonants = new VowelsAndConsonants("tw");
        assertEquals(2, vowelsAndConsonants.countTwo());
    }

    @Test
    public void givenOneString_WhenCountConsonantsAndCountVowels_ThenReturnCountFourAndCountFour() {
        VowelsAndConsonants vowelsAndConsonants = new VowelsAndConsonants("i am a girl");
        assertEquals(4, vowelsAndConsonants.countTwo());
        assertEquals(4, vowelsAndConsonants.count());
    }
    @Test
    public void givenOneStringWithCapitalLetter_WhenCountConsonantsAndCountVowels_ThenReturnCountTwoAndCountTwo() {
        VowelsAndConsonants vowelsAndConsonants = new VowelsAndConsonants("GOOD");
        assertEquals(2, vowelsAndConsonants.countTwo());
        assertEquals(2, vowelsAndConsonants.count());
    }
}
