package com.Stringassignmet40;

public class removedupli {

	static String removeDups(String s) {
		boolean found = false;
		String a = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			boolean isDuplicate = false;

			for (int j = 0; j < i; j++) {
				if (ch == s.charAt(j)) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
				a += ch;
				found = true;
			}
		}

		return a;
	}

	public static void main(String[] args) {
		
		
		    String input = "abca";
		    String result = removeDups(input);
		    System.out.println(result);
	}
}
