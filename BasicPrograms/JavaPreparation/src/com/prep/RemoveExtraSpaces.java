package com.prep;

public class RemoveExtraSpaces {

	public static void main(String[] args) {
		String s = "  i am  suraj";
		String n = s.trim();
		String ne = "";
		String rep = n.replace("  ", " ");

		System.out.println(rep);
//--------------------------------------------------------------//
		

		String[] words = n.split(" ");

		for (String word : words) {
			if (!word.isEmpty()) {
				ne += word + " ";
			}
		}
		System.out.println(ne);
	}
}