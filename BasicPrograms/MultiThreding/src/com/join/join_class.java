package com.join;



class threadjoining_1 extends Thread{

	public void run() {
	//	System.out.println("Inside Run");
		
		for ( int i=1;i<5;i++) {
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
class  threadjoining_2 extends Thread{

	public void run() {
	//	System.out.println("Inside Run");
		
		for ( int i=6;i<11;i++) {
			System.out.println((i));
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

public class join_class {

	public static void main(String[] args) {
	

		 threadjoining_1 s1 =new  threadjoining_1();
	
		 threadjoining_2  s2 =new  threadjoining_2();
		
		s1.start();
		
		try {
			s1.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		s2.start();
	}

}