package com.tw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnagramTest {
    @Test
    public void givenTwoString_WhenCheckAnagram_ThenReturnTrue() {
        Anagram anagram = new Anagram("a", "a");
        Assertions.assertTrue(anagram.check());
    }

    @Test
    public void givenTwoStringWithTwoLetter_WhenCheckAnagram_ThenReturnTrue() {
        Anagram anagram = new Anagram("ab", "ab");
        Assertions.assertTrue(anagram.check());
    }
    @Test
    public void givenTwoStringWithDifferentLength_WhenCheckAnagram_ThenReturnTrue() {
        Anagram anagram = new Anagram("abc", "ab");
        Assertions.assertFalse(anagram.check());
    }

    @Test
    public void givenTwoStringWithLengthThree_WhenCheckAnagram_ThenReturnTrue() {
        Anagram anagram = new Anagram("abc", "bca");
        Assertions.assertTrue(anagram.check());
    }
    @Test
    public void givenTwoStringWithDifferentLength_WhenCheckAnagram_ThenReturnFalse() {
        Anagram anagram = new Anagram("avani", "kale");
        Assertions.assertFalse(anagram.check());
    }
}
