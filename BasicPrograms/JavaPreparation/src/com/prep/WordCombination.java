package com.prep;
/*
 Q12)Given sentence and a word, 
 find if the word can be formed 
 from given characters in sentence.   [1M]

For example, 
s1=”THE SKY IS THE LIMIT”
word = "AXE", -> No 
word = "SIT", -> Yes can be formed
word = "AMIT", -> Yes can be formed
 */

public class WordCombination {

	public static void main(String[] args) {
		String s = "THE SKY IS THE LIMIT";
		String tar = "SMIT";

		boolean flag = true;

		for (int i = 0; i < tar.length(); i++) {
			char chh = tar.charAt(i);
			if (!s.contains(String.valueOf(chh))) {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println(tar + ":" + " " + "Yes Can Be Formed");
		} else {
			System.out.println(tar + ":" + " " + "No");
		}
	}
}