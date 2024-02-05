package com.Stringassignmet40;

public class FirstAndLastWordAlphabetically {

    public static void main(String[] args) {

        String words[] = { "Auraj", "Subhod", "Kaushal", "prasad" };

        if (words.length > 0) {
            String firstWord = words[0];
            String lastWord = words[0];

            for (int i = 1; i < words.length; i++) {
                if (words[i].compareTo(firstWord) < 0) {
                    firstWord = words[i];
                }
                if (words[i].compareTo(lastWord) > 0) {
                    lastWord = words[i];
                }
            }

            System.out.println("First Word : " + firstWord);
            System.out.println("Last Word : " + lastWord);
        } 
    }
}
