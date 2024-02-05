package assignment21N;

abstract class Equipment {
	public void fill() {
		System.out.println("Equipment is filled.");
	}

	public abstract void mix();
}

class Cement_mixer extends Equipment {
	public void mix() {
		System.out.println("Cement mixer is mixing.");
	}

	public void pour() {
		System.out.println("Cement mixer is pouring.");
	}
}

public class EqipmentCement

{
	public static void main(String[] args) {
		Cement_mixer mixer = new Cement_mixer();
		mixer.fill();
		mixer.mix();
		mixer.pour();
System.out.println("---------------------------");
		Equipment e = new Cement_mixer();

		e.fill();
		e.mix();
		// e.pour(); // This line will result in a compilation error because 'pour' is
		// not defined in the Equipment class.
	}
}