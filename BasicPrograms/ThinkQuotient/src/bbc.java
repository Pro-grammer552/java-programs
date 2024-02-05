/*
 *Create a function that takes in a sentence as input and 
returns true if there is at least one alphabetically 
sorted word inside that has a minimum length of 3.

 */
public class bbc {

	public static void main(String[] args) {
		String inputString = "She sells sea shells by the sea shore abcd";

		String[] words = inputString.split(" ");

		boolean foundSortedWord = false;

		for (String w : words) {
			if (w.length() >= 3) {
				boolean isSorted = true;

				for (int i = 0; i < w.length() - 1; i++) {
					if (w.charAt(i) > w.charAt(i + 1)) {
						isSorted = false;
						break;
					}
				}

				if (isSorted) {
					if (!foundSortedWord) {
						System.out.println("Sorted Words:");
						foundSortedWord = true;
					}
					System.out.println(w);
					break;
				}
			}
		}

		if (!foundSortedWord) {
			System.out.println("No alphabetically sorted word with a minimum length of 3 characters found.");
		}
	}
}