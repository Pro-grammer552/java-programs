package com.Assignment53Q;

public class AlternateArray {

	public static void FindAlternativeArray(int[] arrr) {
		for (int i = 0; i < arrr.length; i++) {
			if (i % 2 == 1) {
				System.out.println(arrr[i]);
			}
		}
	}

	public static void main(String[] args) {
		int[] arrr = { 10, 20, 30, 40, 50 };
		FindAlternativeArray(arrr);
	}

}