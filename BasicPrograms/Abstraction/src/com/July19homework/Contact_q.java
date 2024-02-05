

package com.July19homework;

class Contact {
	String Contact_person;
	int mobile;
	String email;
	
	public Contact(String Contact_person , int mobile , String email) {
		this.Contact_person = Contact_person;
		this.mobile = mobile;
		this.email = email;
	}
	public void printContact() {
		System.out.println("Contact Person name:"+ Contact_person+"Mobile number:"+mobile+"Email:"+email);
	}
}

class CompanyContact extends Contact {
	String companyname;
	String website;
	String department;
	String city;
	String country;
	String address;
	int pin;
	public CompanyContact(String Contact_person , int mobile , String email,String companyname, String website, String department, String city, String country,
			String address, int pin) {
		super(Contact_person , mobile,email);
		this.companyname = companyname;
		this.website = website;
		this.department = department;
		this.city = city;
		this.country = country;
		this.address = address;
		this.pin = pin;
		
	}
	public void printContact() {
		System.out.println("Contact Person name:"+ Contact_person+"Mobile number:"+mobile+"Email:"+email + companyname + website + department + city + country+address+pin);
	}
	
}
class EmployeeContact extends Contact{
	String city;
	String country;
	int pin;
	String designation;
	int dateofBirth;
	public EmployeeContact(String Contact_person , int mobile , String email,String city, String country, int pin, String designation, int dateofBirth) {
		super(Contact_person , mobile,email);
		this.city = city;
		this.country = country;
		this.pin = pin;
		this.designation = designation;
		this.dateofBirth = dateofBirth;
	}
	
	
}

public class Contact_q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanyContact c = new CompanyContact("Subodh",906734,"Subodh@gmail.com","SMK","www,sk.com", "Developer", "Pune", "India", "narhe",411041);

		c.printContact();
	}

}
