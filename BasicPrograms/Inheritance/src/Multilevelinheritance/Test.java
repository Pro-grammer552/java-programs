package Multilevelinheritance;

class GrandFather {

	public void m1() {
		String name = "M1";
		System.out.println(name);
	}
	public GrandFather() 
	{
		int a=10;
		System.out.println(a);
		System.out.println("GrandFather");
	}

}

class parent extends GrandFather
{
	public void m2() {
		String name = "M2";
		System.out.println(name);
	}
	
	public parent()
	{
		int a=10;
		System.out.println(a);
		System.out.println("Parent");
	}
}

class Child extends parent

{
	public void m3() {
		String name = "M3";
		System.out.println(name);
	}
	

	public Child()
	{
		int a=10;
		System.out.println(a);
		System.out.println("Child");
	}
	
}


public class Test {

	public static void main(String[] args) {
		
		Child c=new Child();
System.out.println("-----------------------child acess---------------------");		
		c.m1();
		c.m2();
		c.m3();
		
System.out.println("---------------parent access---------------------------");
	
		parent p=new parent();
		p.m1();
		p.m2();
		

	}

}
