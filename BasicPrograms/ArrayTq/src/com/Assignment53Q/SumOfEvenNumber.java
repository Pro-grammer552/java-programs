package com.Assignment53Q;


public class SumOfEvenNumber {
    
    public static void FindEvenOdd(int[] arrr) {
        for (int i = 0; i < arrr.length; i++) {
            if (arrr[i] % 2 == 0) {
                System.out.println(arrr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arrr = {10, 20, 30, 40, 50};
        FindEvenOdd(arrr);
    }
}