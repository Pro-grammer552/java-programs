package LabAssignmentN;

public class MainMethodOverLOading {

	public static void main(String[] args) {
		System.out.println("Overloaded main() String  argument");

		main(5);

	}

	public static void main(Integer args) {
		System.out.println("Overloaded main() integer argument");

		main('a');
	}

	public static void main(char args) {
		System.out.println("Overloaded main()  char argument");
	}

}
