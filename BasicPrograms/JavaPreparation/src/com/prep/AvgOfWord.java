package com.prep;

public class AvgOfWord {

	public static void main(String[] args) {
		String s = "sachin scores 89 runs";

		String ne = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (Character.isDigit(ch)) {
				ne += ch;
			}

		}

		System.out.println(ne);

		int a = Integer.parseInt(ne);

		int b = a;
		System.out.println(a);
		float sum = 0;
		while (b > 0) {
			int dig = b % 10;
			sum = sum + dig;
			b = b / 10;
		}
		
		System.out.println(sum);
		double d=sum/2;
		System.out.println("AVG of word :" + d);
	}

}
