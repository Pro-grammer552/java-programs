package LabHomeWork18_07;

/*
 WAP to create class company with method address. create class eBay which extends
  company implement address() differently in eBay class.
  Here the method address ()has been overridden in child class.
 */

class Company {

	public void address() {

		System.out.println("Error 550");

	}

}

class Ebay extends Company {

	public void address() {
		System.out.println("Error 440");
	}
}

public class CompanyEbay {

	public static void main(String[] args) {
		
		Company comp=new Company();
		comp.address();
		
		Ebay eb=new Ebay();
		eb.address();
		

	}

}
