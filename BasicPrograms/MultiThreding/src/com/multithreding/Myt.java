package com.multithreding;

class my implements Runnable {

	@Override
	public void run() {

		System.out.println("Thread Running : " + Thread.currentThread().getName());
	}
	
	public void he()
	{
		System.out.println("hello");
	}
}

public class Myt {

	public static void main(String[] args) {

		my m = new my();

		Thread t = new Thread(m);

		
		t.start();
		//Thread.sleep(1000);
		
		try {
			t.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread t1 = new Thread(m);
		t1.start();

		m.he();
	}

}






