package com.interThreadCommunication;

import com.multithreding.thread_1;

class account {

	int bal = 1000;

	public synchronized void withdral(int amt) {

		System.out.println(Thread.currentThread().getName() + " wants to withdrawl money" + amt);

		if (bal < amt) {
			System.out.println("--------------------------------");
			System.out.println("---Insufficient Balance");
			System.out.println(Thread.currentThread().getName() + " Waiting for deposite ");

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			withdral(amt);

		} else {

			bal = bal - amt;
			System.out.println("-----------");
			System.out.println("Withdrawl completed by " + Thread.currentThread().getName() + " of " + amt);
			System.out.println("Available Balance is :" + bal);
			System.out.println("---Thank You...!!---");
		}

	}

	public synchronized void deposit(int amt) {
		System.out.println("-----------");
		System.out.println(Thread.currentThread().getName() + " Going to deposit");
		bal = bal + amt;
		System.out.println(Thread.currentThread().getName() + " Has Deposited" + amt);

		System.out.println("New Bal is " + bal);

		notify();
		System.out.println("-----------------------");
	}
}

public class ItcDemo2 {

	public static void main(String[] args) {

		account a = new account();

		Thread t1 = new Thread() {

			public void run() {

				a.withdral(2000);
			}
		};

		Thread t2 = new Thread() {

			public void run() {

				a.deposit(3000);
			}
		};
		t1.start();
		t2.start();

	}

}
