package com.multithreding;

class SleepTread extends Thread{

	public void run() {
	//	System.out.println("Inside Run");
		
		for ( int i=1;i<10;i++) {
			System.out.println(i);
			System.out.println("thread is running ->"+Thread.currentThread().getName());
			Thread t = new Thread();
			try {
				t.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
class SleepTread1 extends Thread{

	public void run() {
	//	System.out.println("Inside Run");
		
		for ( int i=97;i<122;i++) {
			System.out.println((char)(i));
			System.out.println("thread is running ->"+Thread.currentThread().getName());
			Thread t = new Thread();
			try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
public class threadSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SleepTread  s =new SleepTread();
		s.start();
		
		SleepTread1  s1 =new SleepTread1();
		s1.start();
	}

}