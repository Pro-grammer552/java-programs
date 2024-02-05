package com.factory;

public class CreditcardPayment  implements payment{

	@Override
	public void Payment(int amount) {
		
		System.out.println(" credit card processing");
	}

}