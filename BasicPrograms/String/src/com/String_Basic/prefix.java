package com.String_Basic;

public class prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char char1, char2, char3;
		String arr[] = { "flower", "flow" };

		for (int i = 0; i < arr.length-1; i++) {
			char1 = arr[0].charAt(i);
			char2 = arr[1].charAt(i);
			char3 = arr[2].charAt(i);
			if (char1 == char2 && char2 == char3) {
				System.out.print(char1);
				
			}

		}

	}
}
