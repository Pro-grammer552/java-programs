import java.util.Scanner;

/*
 *
3. generate your own function to satisfy the relationship 
between the inputs and outputs.
Your task is to create a function that, when
 fed the inputs below, produce the sample outputs shown.
Examples
832 ➞ 594
51 ➞ 36
7977 ➞ 180
1 ➞ 0
665 ➞ 99
149 ➞ 0
 */
public class abc {
	public static void main(String[] args) {

//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter a number");
		int n = 832;
		int temp = n;
		int add = 0;
		while (n > 0) {

			int digit = n % 10;
			add = add * 10 + digit;
			n = n / 10;

		}
		int val = temp - add;
		val = Math.abs(val);
		System.out.println(val);
	}
}
