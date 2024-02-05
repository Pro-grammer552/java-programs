package interface24N_Lec;

interface Calculator {
	int add(int a, int b);

	int sub(int a, int b);

	int mul(int a, int b);

	int div(int a, int b);

	default void DisplayMode() {
		System.out.println("this is default");
	}

}

class Basiccal implements Calculator {

	@Override
	public int add(int a, int b) {
		return a + b;

	}

	@Override
	public int sub(int a, int b) {
		return a - b;

	}

	@Override
	public int mul(int a, int b) {
		return a * b;

	}

	@Override
	public int div(int a, int b) {
		return a / b;

	}

}

public class TestCalculator {

	public static void main(String[] args) {

		Basiccal b = new Basiccal();
		System.out.println(b.add(10, 20));
		System.out.println(b.sub(10, 20));
		System.out.println(b.mul(10, 20));
		System.out.println(b.div(10, 20));

		b.DisplayMode();

	}

}
