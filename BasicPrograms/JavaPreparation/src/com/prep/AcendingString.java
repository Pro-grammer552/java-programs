package com.prep;

public class AcendingString {

	public static void main(String[] args) {

		String s = "suraj";
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				// char ch = s.charAt(i);

				if (s.charAt(i) > s.charAt(j)) {
					flag = true;

				}

			}

		}
		if (flag) {
			System.out.println("unordered");
		} else {
			System.out.println("Ascending");
		}

	}

}
