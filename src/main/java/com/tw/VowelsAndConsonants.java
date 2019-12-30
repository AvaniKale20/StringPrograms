package com.tw;

public class VowelsAndConsonants {
    private String string;


    public VowelsAndConsonants(String string) {
        this.string = string;
    }

    public int count() {
        String convertedString = string.toLowerCase();

        int countForV = 0;
        for (int j = 0; j < string.length(); j++) {
            if (convertedString.charAt(j) == 'a' || convertedString.charAt(j) == 'e' || convertedString.charAt(j) == 'i' || convertedString.charAt(j) == 'o' || convertedString.charAt(j) == 'u') {
                if (convertedString.charAt(j) != ' ') {
                    countForV++;
                }
            }
        }
        return countForV;


    }

    public int countTwo() {
        String convertedString = string.toLowerCase();

        int countForC = 0;
        for (int j = 0; j < string.length(); j++) {
            if (!(convertedString.charAt(j) == 'a' || convertedString.charAt(j) == 'e' || convertedString.charAt(j) == 'i' || convertedString.charAt(j) == 'o' || convertedString.charAt(j) == 'u')) {
                if (convertedString.charAt(j) != ' ') {
                    countForC++;
                }
            }
        }
        return countForC;
    }
}
