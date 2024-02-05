package Assignment10K;

/*
 * write code to check given number is kaparekar number or not   9->81  ---->8+1=9
 */

public class KaprekarNumber {

	public static void main(String[] args) {
		int num = 9;
		int sqr = num * num; // 2025
		int sum = 0;
		int temp = num;
		int counter = 0;
		while (num > 0) {

			counter++;
			num = num / 10;
		}
		System.out.println(counter);

		int a = (int) Math.pow(10, counter); // 10
		System.out.println(a);

		while (sqr > 0) {
			int digit = sqr % a; // 9%10=9
			
			System.out.println(digit+",");
			sum = sum + digit;
			sqr = sqr / a;
		}

		System.out.println(sum);

		if (temp == sum) {
			System.out.println("Kaprekar Number");
		} else {
			System.out.println("Not an Kaprekar");
		}
	}

}
