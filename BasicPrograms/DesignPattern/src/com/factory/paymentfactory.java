package com.factory;

public class paymentfactory {

	public void choosepaymentType(String type, int amount) {

		if (type.equals("Credit")) {
			new CreditcardPayment().Payment(amount);
		}
		if (type.equals("Debit")) {
			new DebitcardPayment().Payment(amount);
		}
		if (type.equals("Upi")) {
			new Upipayment().Payment(amount);
		}

	}
}