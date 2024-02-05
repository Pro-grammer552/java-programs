package com.Stringassignmet40;

import java.util.*;

public class WordToDigit {
    public static String getPhoneNumber(String s) {
        Map<String, String> a = new HashMap<>();
        a.put("one", "1");
        a.put("two", "2");
        a.put("three", "3");
        a.put("four", "4");
        a.put("five", "5");
        a.put("six", "6");
        a.put("seven", "7");
        a.put("eight", "8");
        a.put("nine", "9");
        a.put("zero", "0");

        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        int k = 1;

        for (String word : words) {
            if (a.containsKey(word)) {
                result.append(a.get(word));
                for (int i = 1; i < k; i++) {
                    result.append(a.get(word));
                }
                k = 1;
            } else if ("double".equals(word)) {
                k = 2;
            } else if ("triple".equals(word)) {
                k = 3;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String inputString = "one double two triple three eight nine double two";
        String result = getPhoneNumber(inputString);
        System.out.println(result);
    }
}