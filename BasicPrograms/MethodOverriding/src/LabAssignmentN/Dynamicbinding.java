package LabAssignmentN;

class mobile {

	public void realme() {
		System.out.println("Realme parent");

	}

}

class Iphone extends mobile {

	public void realme() {
		System.out.println("Iphone14 child");
	}

}

class china extends mobile {

	public void realme() {
		System.out.println("Iphone14 grandchild");
	}

	public void real() {
		System.out.println("real");
	}

}

public class Dynamicbinding {

	public static void main(String[] args) {

		mobile m = new mobile();
		m.realme();

		System.out.println("-----------------------");
		Iphone i = new Iphone();
		i.realme();

		mobile m2 = new Iphone();
		m2.realme();

		m2 = new china();
		m2.realme();

		System.out.println("-------------------------------------------");

		System.out.println("-----------------------------------------");

		mobile mb;
		mb = m2;
		mb.realme();

	}

}
