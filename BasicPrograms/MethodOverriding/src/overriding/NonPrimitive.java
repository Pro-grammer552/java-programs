package overriding;

//

class calculator {

	public Object add() {
		return "Suraj";
	}

}

class simpleCalculator extends calculator {

	public String add() {
		return "Suraj";
	}

}

public class NonPrimitive {

	public static void main(String[] args) {
		calculator c = new calculator();
		String s2 = (String) c.add();

		simpleCalculator sc = new simpleCalculator();
		// sc.add();

		String s1 = sc.add();
		System.out.println(s1);

	}

}
