package com.Assignment53Q;

//3025--> 30+25=55*55=3025

public class Technical_number {

	public static void main(String[] args) {
		int n = 3025;
		int temp2 = n;
		int count = 0;
		while (n > 0) {
			int dig = n % 10;
			count++;
			n = n / 10;
		}
		// System.out.println(count);

		// System.out.println(n);

		int mid = count / 2;
		int po = (int) Math.pow(10, mid);

		if (count % 2 == 0) {
			int ans1 = 0;
			int sq = 1;
			int dig1 = 0;

			for (int i = 0; i < mid; i++) {
				dig1 = temp2 % po;
				System.out.println(dig1);
			}

			int sec = temp2 / po;
			System.out.println(sec);

			int add = dig1 + sec;
			int total = add * add;

			System.out.println(total);

		} else {
			System.out.println("not technical");
		}

	}

}
