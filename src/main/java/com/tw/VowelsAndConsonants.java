package com.tw;

public class VowelsAndConsonants {
    private String string;


    public VowelsAndConsonants(String string) {
        this.string = string;
    }

    public int count() {
        int countForV = 0;
        for (int j = 0; j < string.length(); j++) {
            if (string.charAt(j) == 'a' || string.charAt(j) == 'e' || string.charAt(j) == 'i' || string.charAt(j) == 'o' || string.charAt(j) == 'u') {
                if (string.charAt(j) != ' ') {
                    countForV++;
                }
            }
        }
        return countForV;


    }

    public int countTwo() {
        int countForC = 0;
        for (int j = 0; j < string.length(); j++) {
            if (!(string.charAt(j) == 'a' || string.charAt(j) == 'e' || string.charAt(j) == 'i' || string.charAt(j) == 'o' || string.charAt(j) == 'u')) {
                if (string.charAt(j) != ' ') {
                    countForC++;
                }
            }
        }
        return countForC;
    }
}
