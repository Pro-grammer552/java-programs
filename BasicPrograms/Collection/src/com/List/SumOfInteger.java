package com.List;

import java.util.ArrayList;

public class SumOfInteger {

	public static void main(String[] args) {
		ArrayList<Integer> arr3 = new ArrayList<>();

		arr3.add(2);
		arr3.add(3);
		arr3.add(5);
		
		int sum = 0;
		for (Integer n : arr3) {
			sum = sum + n;
		}

		System.out.println(sum);

	}

}