package com.join;

class ThreadDemo extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().isAlive());

		System.out.println("--Start--");
		for (int i = 0; i <= 5; i++) {
			System.out.println("i :" + i);

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

public class JoinClass2 {

	public static void main(String[] args) {

		ThreadDemo t1 = new ThreadDemo();
		System.out.println(" Thread_1 " + t1.isAlive());
		t1.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ThreadDemo t2 = new ThreadDemo();
		t2.start();
		System.out.println("THread_1 " + t1.isAlive());
		System.out.println("THread_t2 " + t2.isAlive());

	}

}
