package com.deadlock;

class MyThread extends Thread {

	Shared r1;
	Shared r2;

	MyThread(Shared r1, Shared r2) {
		this.r1 = r1;
		this.r2 = r2;
	}

	public void run() {
		r1.javaTest(r2);
	}

}

class MyThread2 extends Thread {

	Shared r1;
	Shared r2;

	MyThread2(Shared r1, Shared r2) {
		this.r1 = r1;
		this.r2 = r2;
	}

	

	public void run() {
		r2.javaTest(r1);
	}

}

public class TestLock {

	public static void main(String[] args) {
		Shared s1 = new Shared();
		Shared s2 = new Shared();

		MyThread r1 = new MyThread(s1, s2);
		MyThread2 r2 = new MyThread2(s1, s2);

		r1.start();
		r2.start();
		
	}

}
