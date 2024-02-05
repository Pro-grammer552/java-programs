package com.multithreding;


//randomly run hote hai methods 

class Mythread extends Thread{
	public void run() {
		System.out.println("thread is running ->"+Thread.currentThread().getName());
	}
}

public class thread_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mythread t1 = new Mythread();
		t1.start();
		Mythread t2 = new Mythread();
		t2.start();
		Mythread t3 = new Mythread();
		t3.start();
		Mythread t4 = new Mythread();
		t4.run();
		
	}

}
