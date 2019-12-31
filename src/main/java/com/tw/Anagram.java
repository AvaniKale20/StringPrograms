package com.tw;

import java.util.Arrays;

public class Anagram {
    private String one;
    private String two;

    public Anagram(String one, String two) {
        this.one = one;
        this.two = two;
    }

    private String sort(String stringForSorting) {

        ////Converting to character array
        char[] oneString = stringForSorting.toCharArray();

        for (int i = 0; i < oneString.length - 1; i++) {
            for (int j = i + 1; j < oneString.length; j++) {
                if (oneString[i] > oneString[j]) {
                    char temp = oneString[i];
                    oneString[i] = oneString[j];
                    oneString[j] = temp;

                }
            }
        }
        String convertedIntoString = Arrays.toString(oneString);
        return convertedIntoString;

    }

    public boolean check() {
        String oneStringConvertToLowerCase = one.toLowerCase();
        String secondStringConvertToLowerCase = two.toLowerCase();

        if (one.length() == two.length()) {
            String sortedOneString = sort(oneStringConvertToLowerCase);
            String sortedSecondString = sort(secondStringConvertToLowerCase);
            return sortedOneString.equals(sortedSecondString);// Arrays.equals(oneSorted, twoSorted)==true
        }
        return false;
    }
}
