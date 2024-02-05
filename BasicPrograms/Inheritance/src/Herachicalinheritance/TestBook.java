package Herachicalinheritance;

class Mobile 
{
 public void m1()
 {
	 String name="VIVO";
	 System.out.println(name);
 }
}

class Android extends Mobile {

	 public void m2()
	 {
		 String name="Oppo";
		 System.out.println(name);
	 }
	
	
}

class Iphone extends Mobile 
{
	 public void m3()
	 {
		 String name="Apple";
		 System.out.println(name);
	 }
	
}

public class TestBook {

	public static void main(String[] args) {
		Android a=new Android();
		a.m1();
		a.m2();
		System.out.println("-------------------");
		Iphone i=new Iphone();
		i.m1();
		i.m3();
		
		
		
		
	}

}
