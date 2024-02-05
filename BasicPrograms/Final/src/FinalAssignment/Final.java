package FinalAssignment;

public class Final {

	final int a = 20;
	final int num;

	static final int x;

	
	
	static {
		x = 10;
	}

	public Final() {
		num = 12;
	}

	public Final(int num) {

		this.num = num;
	}

	public static void main(String[] args) {

		int b = 11;
		b++;
		System.out.println(b); // 12

		Final f = new Final();
		System.out.println(f.a); // 20

		// f=new Final(b);

	}

}
