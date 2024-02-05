package SundayAssignment;

import java.util.*;

public class MultiplicationOfThreeNumbers {

	
	//count for length
	public static int countDigits(int n) {
		int count = 0;
		while (n > 0) {
			n /= 10;
			count++;
		}
		return count;
	}

	//multiplication of splited pairs
	public static int calculateProduct(int number) {
		int mul = 1;
		while (number > 0) {
			int digit = number % 10;
			mul *= digit;
			number = number / 10;
		}
		return mul;
	}

	public static void main(String[] args) {
		int n = 1234070;

		int numDigits = countDigits(n);
		int numPairs = numDigits - 2;  // number of pairs will creates
		for (int i = 0; i < numPairs; i++) {
			int pair = n % 1000;   //we want pair in power of 3

			int product = calculateProduct(pair);
			System.out.println(pair + " : " + product);

			n /= 10;
		}
	}

}

//		String nStr = Integer.toString(n);
//		List<String> pairs = new ArrayList<>();
//		for (int i = 0; i < nStr.length() - 2; i++) {
//			String pair = nStr.substring(i, i + 3);
//			pairs.add(pair);
//		}
//		for (String pair : pairs) {
//			int product = 1;
//			for (int i = 0; i < pair.length(); i++) {
//				int digit = Character.getNumericValue(pair.charAt(i));
//				product *= digit;
//			}
//			System.out.println(pair + " * " + product);
