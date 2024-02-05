/*
 7.	Create class Bank(super)having getInterest() 
 method returning interest .create any three child
  classes like sbi,icici,axis and
  override method in respective class
 */


package com.July19homework;

class Bank{
	public double getInterest(double interest ){
		return interest;
	}
}
class sbi extends Bank{
	public double getInterest(double interest){
		return interest;
	}
}
class icici extends Bank{
	public double getInterest(double interest){
		return interest;
	}
}
class axis extends Bank{
	public double getInterest(double interest){
		return interest;
	}
}

public class Bank_q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          sbi s=new sbi();
          System.out.println("Interest is: "+s.getInterest(300));
	}


}
