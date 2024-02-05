package com.deadlock;

public class Shared {

	synchronized void javaTest(Shared s2) {

		System.out.println("Java Test Started..");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s2.sqlTest();
		
		System.out.println("Java Test Ended...");
	}

	synchronized void sqlTest() {

		System.out.println("Java Test Started..");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Sql Test Ends...");

	}


}
