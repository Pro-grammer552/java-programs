package com.July18homework;

class Company {
	public void address() {
		System.out.println("Company address");
	}
}
class eBay {
//	@Override
	public void address() {
		System.out.println("eBay address");
	}
}

public class Companyques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		eBay e = new eBay();
		e.address();
	}

}
