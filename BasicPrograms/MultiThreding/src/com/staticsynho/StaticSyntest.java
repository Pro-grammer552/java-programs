package com.staticsynho;

//To Lock Minimum and required Code use synchronised Block

class Table {
	public static synchronized void print(int n) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(n + " * " + i + " =" + n * i);
			

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class StaticSyntest {

	public static void main(String[] args) {

		Thread t1 = new Thread() {

			public void run() {
				Table.print(5);
				System.out.println("---------------------------");
			}
		};

		Thread t2 = new Thread() {

			public void run() {
				Table.print(10);
			}
		};
		t1.start();
		t2.start();

	}

}
