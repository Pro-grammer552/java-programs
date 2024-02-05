package com.multithreding;

public class InteruptException {

	public static void main(String args[]) {
		Thread t = new Thread() {

			public void run() {
				int i;
				try {
					for (i = 0; i < 5; i++) {
						System.out.println("i =" + i);
						Thread.sleep(1000);
					}

				} catch (InterruptedException e) {
					throw new RuntimeException("thread Interputted");
				}
			}

		};

		t.start();

		try {
			t.interrupt();
		} catch (RuntimeException e) {
			System.out.println("hello");

		}
	}
}
