package com.July18homework;

class Kid {
	public void readbook() {
		System.out.println("Kid readbook");
	}
	public void readbook( int book , int Notebook) {
		System.out.println();
	}
}
 
class BigKid extends Kid {

	@Override
	public void readbook() {
		System.out.println("Big Kid ");
	}
	@Override
	public void readbook( int book , int Notebook) { 
		System.out.println("Big kid"+" " +book +" "+ Notebook );
	}
}

public class Kidques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigKid b1 = new BigKid();
		b1.readbook();
		b1.readbook(2, 3);

	}

}
