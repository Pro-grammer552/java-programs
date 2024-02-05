package com.methodinner;

class outer_1 {
	private int s = 10;

	public void show() {
		class inner_1 {
			public void m1() {
				System.out.println("hello");
			}
		}
		new inner_1().m1();
	}
}

public class methodclass {

	public static void main(String[] args) {

		outer_1 obj = new outer_1();
		obj.show();
	}

}
