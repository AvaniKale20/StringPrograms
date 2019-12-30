package com.tw;

public class VowelsAndConsonants {
    private String string;

    public VowelsAndConsonants(String string) {
        this.string = string;
    }

    public int count() {
        int count = 0;
        for (int j = 0; j < string.length(); j++) {
            if (string.charAt(j) == 'a' || string.charAt(j) == 'e' || string.charAt(j) == 'i' || string.charAt(j) == 'o' || string.charAt(j) == 'u') {
                count++;
            }
        }
        return count;
    }
}
