package com.prep;

public class SecondMax {

	public static void main(String[] args) {

		String s = "india is beautiful country";
		String word[] = s.split(" ");
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		String firstmax = "";
		String secondmax="";
		for (int i = 0; i < word.length; i++) {

			if (word[i].length() > max) {
				max = word[i].length();
				firstmax = word[i];
			}

			if (max < min) {
				min = max;
				secondmax=word[i];
			}
		}
		System.out.println("max length :" + max + " " + firstmax);
		 System.out.println("SecondMin length : " + min+" "+secondmax);
	}

}