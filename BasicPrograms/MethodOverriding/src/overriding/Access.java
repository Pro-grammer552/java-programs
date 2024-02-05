package overriding;

 class Access1 {

	
	protected void m1()
	{
		System.out.println("This is m1 method");
	}
	 
	 
}
	
	class Modifier extends Access1
	{
		
		@Override
		
		public  void m1()
		{
			System.out.println("This is m2 method");
		}
		
	}
	
	
public class Access
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Access1 a=new Access1();
		a.m1();
		
		Modifier m=new Modifier();
		m.m1();
		
		
		
		
	}

}
