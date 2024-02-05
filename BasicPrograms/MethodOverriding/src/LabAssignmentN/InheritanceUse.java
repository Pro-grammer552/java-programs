package LabAssignmentN;

class Person {
	protected String name;
	protected int age;
	protected String email;
	protected String contact;

	public Person(String name, int age, String email, String contact) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.contact = contact;
	}

	public void show() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(email);
		System.out.println(contact);
	}

}

class Student extends Person {
	int rollno;
	double marks;

	public Student(String name, int age, String email, String contact, int rollno, double marks) {
		super(name, age, email, contact);
		this.rollno = rollno;
		this.marks = marks;
	}

	public void show() {
		System.out.println(rollno);
		super.show();
		System.out.println(marks);
	}
}

public class InheritanceUse {

	public static void main(String[] args) {

		Person p1 = new Person("suraj", 30, "surajyelmate444@gamail.com", "9876543210");
		p1.show();

		System.out.println();

	}

}
