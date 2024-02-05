package com.multithreding;

public class my1 extends Thread {

	public void run() {

		for (int i = 0; i <= 5; i++) {
			System.out.println("i=" + i);

			Thread t = new Thread();
			try {
				t.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {

		my1 m = new my1();
		m.start();

	}

}
