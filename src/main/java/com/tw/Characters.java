package com.tw;

public class Characters {

    private String string;


    public Characters(String string) {
        this.string = string;
    }

    public int count() {
        int count = 0;
        int lenghtOfString = string.length();
        for (int i = 0; i < lenghtOfString; i++) {
            if (string.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }
}
