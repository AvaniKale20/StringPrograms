package com.tw;

public class Reverse {

    public String make(String actualString) {
        String reverseString = "";
        char convertIntoChar[] = actualString.toCharArray();
        for (int i = convertIntoChar.length - 1; i >= 0; i--) {
            reverseString = reverseString + convertIntoChar[i];
        }
        return reverseString;
    }
}
