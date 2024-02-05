package com.factory;

public class DebitcardPayment implements payment {

	@Override
	public void Payment(int amount) {
		System.out.println("Debit card processing...");
	}

}