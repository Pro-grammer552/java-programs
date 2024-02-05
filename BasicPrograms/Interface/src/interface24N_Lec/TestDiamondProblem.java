package interface24N_Lec;

interface A {
	default void show() {
		System.out.println("InterfaceA");
	}

	// After java9
	private void showprivate() {
		System.out.println("private");
	}

	static void showstatic() {
		System.out.println("Static");
	}

}

interface b {
	default void show() {
		System.out.println("Interfaceb");
	}
	}

class child implements A, b {

	public void show() {
		A.super.show();
		b.super.show();

		// A.super.showprivate();
	}
}

public class TestDiamondProblem {

	public static void main(String[] args) {
		child c =new child();
		c.show();
		//c.showp();
		
		
		
	A.showstatic();
	
		

		
		
		
		

	}

}
