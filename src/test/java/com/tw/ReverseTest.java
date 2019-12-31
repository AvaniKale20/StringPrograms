package com.tw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseTest {
    @Test
    public void givenString_WhenMakeReverse_ThenReturnReverseString() {
        Reverse reverse = new Reverse();
        Assertions.assertEquals("ih", reverse.make("hi"));

    }
}
