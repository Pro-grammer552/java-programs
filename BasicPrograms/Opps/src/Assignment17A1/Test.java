package Assignment17A1;

//same pkg

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Student s = new Student();
		  s.cName="suraj";                   //public
		  s.Cemail="abc@gmail.com";          //protected
		 s.Caddress="pune";                  //default
		
		 //  s.accBalance=100;              //private //not accessible
		  
		  
		  
		  
		  s.doPublic();
		  s.doDefault();
		  s.doProtected();
		
		  // s.doPrivate();   //not acessible
		  
		  
		  
	}

}
