package com.assignment37;

class CustomException extends Exception {
	CustomException(String message) {
		super(message);
	}
}

public class SumValidation {
	public static void declare(String str) {

		String startstr = str.substring(0, 3);

		String endstr = str.substring(str.length() - 3, str.length());

		System.out.println(startstr + "   " + endstr);

		Integer a = Integer.parseInt(startstr);
		int ans1 = calculateSum(a);
		Integer b = Integer.parseInt(endstr);
		int ans2 = calculateSum(b);

		System.out.println(ans1 + "    " + ans2);

	}

	public static int calculateSum(Integer a) {

		int sum = 0;
		while (a > 0) {

			int rem = a % 10;
			sum += rem;
			a = a / 10;

		}
		return sum;

	}

	public static void main(String[] args) {

		String str = "1234567";
		declare(str);

	}

}