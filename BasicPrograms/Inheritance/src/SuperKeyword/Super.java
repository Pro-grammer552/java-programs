package SuperKeyword;

class animal {

	
	int m=10;
	public animal() {
		System.out.println(" animal constructor");
	}

	public void m1() {
		System.out.println("this is m1 method");
	}

}

class human extends animal {
	
	public human() {
		super();                                           //calling through constructor
		
		System.out.println(" Human constructor");
	}

	
	public void m2() {
		
		System.out.println( m+ " "+super.m);                  //calling through instance Variable 
		super.m1();                                           //calling through Method
		System.out.println("this is m2 method");
	}

}

public class Super {

	public static void main(String[] args) {

		human h = new human();
		//h.m2();
		h.m2();
	}	

}
