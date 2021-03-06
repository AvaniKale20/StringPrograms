package com.tw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CharacterTest {
    @Test
    public void givenOneString_WhenCountCharacter_ThenReturnCount() {
        Characters character = new Characters("a");

        Assertions.assertEquals(1, character.count());
    }

    @Test
    public void givenOneString_WhenCountCharacter_ThenReturnCountIsTwo() {
        Characters character = new Characters("av");

        Assertions.assertEquals(2, character.count());
    }

    @Test
    public void givenOneString_WhenCountCharacter_ThenReturnCountIsThree() {
        Characters character = new Characters("ram");

        Assertions.assertEquals(3, character.count());
    }

    @Test
    public void givenOneString_WhenCountCharacter_ThenReturnCountIsFive() {
        Characters character = new Characters("A girl");

        Assertions.assertEquals(5, character.count());
    }
}
