package SingleInheritance;


/*
  write code to code for a single inheritance using real world example 
 */



public class Fruit {
	public void m2() {
		String name = "Mango";
		System.out.println(name);
	}

}

class Mango extends Fruit {
	public void m1() {
		System.out.println("abc");
	}
}

class main {
	public static void main(String[] args) {
		Mango m = new Mango();
		m.m2();
		m.m1();

	}
}
