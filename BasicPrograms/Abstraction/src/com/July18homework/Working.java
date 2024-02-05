package com.July18homework;

class Programmer {
	public void workinghour() {
		System.out.println(" 6 hours");
	}
}
class Employee extends Programmer{
	public void workinghour() {
		System.out.println(" 8 hours");
	}
}

public class Working {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee();
		e.workinghour();
	}

}
