package Assignment13K;

public class EncapsulationInfo {

	public static void main(String[] args) {

		Encapsulation e = new Encapsulation();

		e.setid(101);
		e.setmarks(100);
		e.setname("suraj");
		e.setpercentage(80);
		System.out.println(e.getid() + " " + e.getmarks() + " " + e.getname() + " " + e.getpercentage());

		if (e.getpercentage() >= 70) {
			boolean a = true;
			System.out.println("You Are Placed....!");
		} else {

			System.out.println("Better Luck Next Time...!!");

		}

	}

}
