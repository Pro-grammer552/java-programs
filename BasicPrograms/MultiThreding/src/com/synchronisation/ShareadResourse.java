package com.synchronisation;

//With Anonymous

class print {

	public synchronized void printname(String name) {

		System.out.print("{" + name);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.print("}");
	}
}

public class ShareadResourse {

	public static void main(String[] args) {

		print p = new print();
		Thread t1 = new Thread() {

			public void run() {
				p.printname("Suraj");
			}

		};

		Thread t2 = new Thread() {

			public void run() {
				p.printname("Subhodh");
			}
		};

		t1.start();
		t2.start();
	}

}
