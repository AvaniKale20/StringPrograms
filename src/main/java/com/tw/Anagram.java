package com.tw;

import java.util.Arrays;

public class Anagram {
    private String one;
    private String two;

    public Anagram(String one, String two) {
        this.one = one;
        this.two = two;
    }

    private String sorting(String s1) {

        ////Converting to character array
        char[] oneString = s1.toCharArray();

        for (int i = 0; i < oneString.length - 1; i++) {
            for (int j = i + 1; j < oneString.length; j++) {
                if (oneString[i] > oneString[j]) {
                    char temp = oneString[i];
                    oneString[i] = oneString[j];
                    oneString[j] = temp;

                }
            }
        }
        String converted = Arrays.toString(oneString);
        return converted;

    }

    public boolean check() {
        String oneStringConvertToLowerCase = one.toLowerCase();
        String secondStringConvertToLowerCase = two.toLowerCase();

        if (one.length() == two.length()) {
            String oneSorted = sorting(oneStringConvertToLowerCase);
            String twoSorted = sorting(secondStringConvertToLowerCase);
            return oneSorted.equals(twoSorted);// Arrays.equals(oneSorted, twoSorted)==true
        }
        return false;
    }
}
