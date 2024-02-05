package com.Assignment53Q;

public class DuplicateCount {

    public static void main(String[] args) {

        int[] a = { 4, 9, 6, 5, 4, 4, 8, 9 };

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] && i!=j) {
                    count++;
                }
            }

            // Print the duplicate count only once for each element
            if (count > 0) {
                System.out.println(a[i] + " has " + (count + 1) + " duplicates."); // Add 1 to count for the current element itself
            }
        }
    }
}
