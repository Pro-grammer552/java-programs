package LabAssignment19;

class Animal {
	int a = 10;
	String name = "name";
	
	
	public Animal()
	{
		System.out.println("Default");
	}
	
	
	public Animal(int a, String name) {
		this();                                                 //this calling through constructor
		this.a = a;
		this.name = name;
		System.out.println("PArameterised");
	}
	
	public void dog() {
		
		
		this.cat();                                                //this calling through method Variable
	}
	

	public void cat() {
		System.out.println(this.a);                                //this calling through instance Variable
		System.out.println("This is cat method ");
		
		
	}

}

class Human extends Animal {

	public Human() {
		super();                                                     // super calling through constructor
		System.out.println("Default");

	}

	public void man() {

		System.out.println(name + " " + super.name);              // super calling through instance Variable
		super.cat();                                              // super calling through Method
		System.out.println("This is man method");
	}

}

public class This_super_demo {

	public static void main(String[] args) {

		Human h = new Human();
		h.cat();

	}

}
