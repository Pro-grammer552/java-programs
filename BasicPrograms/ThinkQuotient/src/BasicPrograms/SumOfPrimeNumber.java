package BasicPrograms;

public class SumOfPrimeNumber {

	public static void main(String[] args) {

		int n = 10;
		int sum = 0;

		for (int i = 2; i <= n; i++) {
			int flag = 1;

			for (int j =2 ; j < i; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}

			if (flag == 1) {
				sum =sum+ i;
				System.out.println(i);
			}

		}
		System.out.println("Sum " + sum);

	}
}
