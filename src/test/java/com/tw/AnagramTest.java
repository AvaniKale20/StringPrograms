package com.tw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnagramTest {
    @Test
    public void givenTwoString_WhenCheckAnagram_ThenReturnTrue() {
        Anagram anagram = new Anagram("a", "a");
        Assertions.assertTrue(anagram.check());
    }
}