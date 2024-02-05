package com.deadlock;

public class Deadlock2 {

	public static void main(String[] args) {

		final String res1 = "java";
		final String res2 = "sql";

		Thread t1 = new Thread() {

			public void run() {
				synchronized (res1) {
					System.out.println(Thread.currentThread().getName() + " " + "has locked" + res1);

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					synchronized (res2) {
						System.out.println(Thread.currentThread().getName() + " " + "has locked" + res2);

					}
				}
				System.out.println(Thread.currentThread().getName() + "Finished task" + res1);
				System.out.println(Thread.currentThread().getName() + " " + "released" + res1 + " " + "and" + res2);

			}

		};

		Thread t2 = new Thread() {

			public void run() {
				synchronized (res2) {
					System.out.println(Thread.currentThread().getName() + " " + "has locked" + res1);

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					synchronized (res1) {
						System.out.println(Thread.currentThread().getName() + " " + "has locked" + res2);

					}
				}
				System.out.println(Thread.currentThread().getName() + "Finished task" + res1);
				System.out.println(Thread.currentThread().getName() + " " + "released" + res1 + " " + "and" + res2);

			}

		};
		t1.start();
		t2.start();

	}

}
