package com.join;

class ThreadDemo1 extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().isAlive());
		int a = 5;
		System.out.println("--Start--");
		System.out.println("Table of 5");
		for (int i = 1; i <= 10; i++) {
			System.out.println("5" + "*" + i + " " + "=" + a * i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("--END--");

	}
}

class ThreadDemo2 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().isAlive());
		int a = 6;
		System.out.println("--Start--");
		System.out.println("Table of 6");
		for (int i = 1; i <= 10; i++) {
			System.out.println("6" + "*" + i + "" + "=:" + a * i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("--END--");

	}
}

class ThreadDemo3 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().isAlive());
		int a = 10;
		System.out.println("--Start--");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Table of 10");
			System.out.println("10" + "*" + i + " =" + a * i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("--END--");

	}

}

public class ThreadTable {

	public static void main(String[] args) {

		ThreadDemo1 t1 = new ThreadDemo1();
		ThreadDemo2 t2 = new ThreadDemo2();
		ThreadDemo3 t3 = new ThreadDemo3();

		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();

	}

}
