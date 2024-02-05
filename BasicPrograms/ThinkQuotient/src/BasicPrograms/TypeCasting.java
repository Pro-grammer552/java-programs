package BasicPrograms;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//implicit
		int a=40;
		float b=a;
		System.out.println(b);
		
		//explicit
		float d=38.40f;
		int e=(int) d;
		System.out.println(d);

		char f='A';
		int g=f;
		System.out.println("Ascii value  " + g);
		
		int a1=65+a;
		char a2= (char) a1;
		System.out.println(a2);
		
	}

}
