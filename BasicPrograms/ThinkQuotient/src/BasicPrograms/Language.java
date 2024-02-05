package BasicPrograms;

public class Language {

	int a = 10;
	static String name = "Suraj";

	public void java() {
		System.out.println("Java Language");
	}

	static {
		System.out.println("Static block");
		
		
	}

	static void python() {
		System.out.println("python language ");
		System.out.println(Language.name +" "+  "calling static variable"   );
	
	}

	public static void main(String[] args) {

		Language l = new Language();
		l.java();

		Language.python();

	}

}


//class person
//id
//name
//balance
//acc n
//10000
