package LabHomeWork18_07;

/*
 WAP to create class Person with method readScript().
 create class Actor which extends Person implement readScript() differently in child.
 */

class Person {
	
	public void readScript() {
		System.out.println("Generic person reading the script.");
	}
}

class Actor extends Person {
	@Override
	public void readScript() {
		System.out.println("Actor reading the script.");
	}
}

public class PersonActor {

	public static void main(String[] args) {
		Person person = new Person();
		Actor actor = new Actor();

		person.readScript();
		actor.readScript();

	}

}
