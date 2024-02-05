package com.Stringassignmet40;

public class TotalNoOfVowelConso {

    public static void main(String[] args) {

        String str = "HappY BirthDay To You";

        str = str.toLowerCase(); 

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Vowel Count: " + vowelCount);
        System.out.println("Consonant Count: " + consonantCount);
    }
    
}