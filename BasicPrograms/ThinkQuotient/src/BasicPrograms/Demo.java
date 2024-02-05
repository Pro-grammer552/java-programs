package BasicPrograms;

public class Demo {

	public static void order(int a) {

		int max = a % 10;
		a = a / 10;
		System.out.println(max);
		boolean flag = false;
		while (a > 0) {
			int n = a % 10;

			// System.out.println(n);

			if (n > max) {

				flag = true;
				break;
			}

			max = n;
			System.out.println(max);
			a = a / 10;
		}
		if (!flag) {
			System.out.println("incresing");
		} else {
			System.out.println("Bouncy");
		}

	}

	public static void main(String[] args) {
		int a = 1254;

		order(a);

		// System.out.println(d);

	}

}
