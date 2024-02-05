package com.Assignment53Q;

import java.util.Arrays;

public class AlternateCharacter {
    public static void main(String[] args) {
        char[] inputArr = {'T', 'D', 'A', 'Q','Z','Y'};
        char[] resultArr = new char[inputArr.length];

        for (int i = 0; i < inputArr.length; i++) {
            char ch = inputArr[i];

            if (ch >= 'A' && ch <= 'X' ) {
                resultArr[i] = (char) (ch + 34);
            } else if(ch =='Z' || ch == 'Y'){
                resultArr[i] = (char) (ch + 32);
            }
        }

        System.out.println("Original array: " + Arrays.toString(inputArr));
        System.out.println("Converted array: " +  Arrays.toString(resultArr));
    }
}

