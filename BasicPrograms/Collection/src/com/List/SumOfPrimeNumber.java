package com.List;

import java.util.ArrayList;

public class SumOfPrimeNumber {

    public static void main(String[] args) {
        ArrayList<Integer> arr3 = new ArrayList<>();

        arr3.add(2);
        arr3.add(3);
        arr3.add(5);
        arr3.add(7);
        arr3.add(1);
        arr3.add(10);

        int sum = 0;

        for (int i = 0; i < arr3.size(); i++) {
            int flag = 1;
            if (arr3.get(i) == 1) {
                flag = 0;
            } else {
                for (int j = 2; j < arr3.get(i); j++) {
                    if (arr3.get(i) % j == 0) {
                        flag = 0;
                        break;
                    }
                }
            }

            if (flag == 1) {
                sum += arr3.get(i);
            }
        }

        System.out.println("Sum of prime numbers: " + sum);
    }
}
