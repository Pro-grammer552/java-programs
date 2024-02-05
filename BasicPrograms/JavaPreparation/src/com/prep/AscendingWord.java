package com.prep;

public class AscendingWord {

	public static void ascend(String words[]) {
		// boolean sort = false;

		for (String w : words) {
			if (w.length() > 3) {
				boolean flag = true;
				for (int i = 0; i < w.length() - 1; i++) {
					if (w.charAt(i) > w.charAt(i + 1)) {
						flag = false;

					}
				}

				if (!flag) {

					System.out.println("false");

				} else {
					System.out.println("true");
				}
			}
		}

	}

	public static void main(String[] args) {
		String s = "she sells sea shells byzzz the sea shore";
		String words[] = s.split(" ");

		ascend(words);

	}
}
