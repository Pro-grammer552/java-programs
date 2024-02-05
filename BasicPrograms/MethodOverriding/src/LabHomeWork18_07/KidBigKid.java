package LabHomeWork18_07;

/*
 * WAP to create a class Kid with method readBook() and another method readBook () with 2
parameters. The method readBook here is over-loaded (same method name but different
parameters) Create a class BigKid which extends Kid created above. Implement readBook() differently in
BigKid class. Here the method readBook() has been over-ridden in the child class BigKid()

 */

class kid {

	public void readBook() {
		System.out.println("Empty ReadBook Parent");
	}

	public void readBook(int a, int b) {
		System.out.println("Parameter ReadBook parent");
	}

}

class BigKid extends kid {

	@Override
	public void readBook() {
		System.out.println("Empty parameter child");
	}

	public void readBook(int a, int b) {
		System.out.println("Parameter ReadBook child");
	}

}

public class KidBigKid {

	public static void main(String[] args) {
//		kid k=new kid();
//		k.readBook();
//		k.readBook(10, 20);
		
		BigKid bk=new BigKid();
		bk.readBook();
		bk.readBook(10, 20);
		

	}

}
