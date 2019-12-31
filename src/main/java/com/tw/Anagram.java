package com.tw;

public class Anagram {
    private String one;
    private String two;
    boolean flag = false;

    public Anagram(String one, String two) {
        this.one = one;
        this.two = two;
    }

    public boolean check() {
        if (one.equals(two)) {
            return flag = true;
        }
        return false;
    }
}
