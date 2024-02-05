package com.String_Basic;

public class abc {
	public static void main(String[] args) {
		String moves = "LL_RR__";

		
		
		int count1 = 0;
		int count2 = 0;
		int len = moves.length();
		String b=moves.replace('_', 'L');
		
		for (int i = 0; i < len; i++) {
			char ch = b.charAt(i);
			if (ch == 'L') {
				count1++;
			} else {
				count2--;
			}

		}
		
		
		System.out.println(b);
		System.out.println(Math.abs(count1 + count2));

	}
}
