package com.interThreadCommunication;

public class Test {

	public static void main(String[] args) {

		SharedR s = new SharedR();
		Thread t1 = new Thread() {

			public void run() {

				s.method1();

			}
		};

		Thread t2 = new Thread() {

			public void run() {

				s.method2();

			}
		};

		t1.start();
		t2.start();
	}

}
