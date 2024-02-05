package com.Stringassignmet40;

import java.util.Arrays;

public class ReversePosition {

	public static void main(String[] args) {

		String s = "i.like.this.program.very.much";
		String a = s.replace('.', ' ');

		System.out.println(a);
		String words[] = a.split(" ");

		String n[] = new String[words.length];

		for (int i = 0; i < words.length; i++) {
			n[i] = words[words.length - 1 - i];
		}

		String ans = "";

		for (int i = 0; i < n.length; i++) {
			if (i < n.length - 1)
				ans += n[i] + '.';
			else
				ans += n[i];
		}

		System.out.println(Arrays.toString(n));
		System.out.println(ans);

	}

}
