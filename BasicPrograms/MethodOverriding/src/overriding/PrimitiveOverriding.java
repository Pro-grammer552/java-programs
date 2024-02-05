package overriding;

class animal {
	public void dog() {
		System.out.println("This is dog");
	}

	public String cat() {
		return "cat1";
	}

}

class Breed extends animal {

	@Override

	public void dog() {
		System.out.println("its dog breed ");
	}

	@Override
	public String cat() {
		return "cat2";
	}
}

public class PrimitiveOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		animal a = new animal();
		a.dog(); // This is dog
		System.out.println(a.cat());

		Breed b = new Breed();
		b.dog(); // its dog breed
		System.out.println(b.cat());
		animal c = new Breed();
		c.dog(); // its dog breed
		System.out.println(c.cat());
	}

}
