package com.Assignment53Q;

import java.util.Arrays;

public class MaximumNumberArray {

    public static void main(String[] args) {

        int[] arr = { 8, 2, 5, 4 };

        int len = arr.length;
        int store[] = new int[len];

        for (int i = 0; i < len; i++) {
            int max = arr[i];
            for (int j = i + 1; j < len; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }
            store[i] = max;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(store).replace(",", ""));
    }
}
