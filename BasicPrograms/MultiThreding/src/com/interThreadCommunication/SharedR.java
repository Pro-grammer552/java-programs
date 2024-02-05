package com.interThreadCommunication;

public class SharedR {

	public synchronized void method1() {

		String tname = Thread.currentThread().getName();

		System.out.println(tname + " task Started");
		System.out.println(tname + " task locked");
		System.out.println(tname + " task has released");

		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(tname + " has finished");

	}

	public synchronized void method2() {

		String tname = Thread.currentThread().getName();

		System.out.println(" task notified");
		notify();
		System.out.println(tname + " has notified");
	}



}
