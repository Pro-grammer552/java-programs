package com.Stringassignmet40;

////do again vowels sorting 

public class VowelConsonantSorting {

	public static void main(String[] args) {

		String s = "lEetcOde";
		char ch[] = s.toCharArray();
		String re = "";
		String res = "";

		for (int k = 0; k < ch.length; k++) {
			if (ch[k] == 'a' || ch[k] == 'e' || ch[k] == 'i' || ch[k] == 'o' || ch[k] == 'u' || ch[k] == 'A'
					|| ch[k] == 'E' || ch[k] == 'I' || ch[k] == 'O' || ch[k] == 'U') {

				for (int i = 0; i < ch.length; i++) {
					for (int j = i + 1; j < ch.length; j++) {
						if (ch[i] > ch[j]) {
							char temp = ch[i];
							ch[i] = ch[j];
							ch[j] = temp;
						}
					}
				}
				re = re + ch[k];
			} else {
				res = res + ch[k];
			}
		}

		System.out.println(res + re);
	}
}
