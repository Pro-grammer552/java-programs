package overriding;

/*
 
wap to create class bike with fields colour speed 
and method bikeInfo() which is show colour and speed of bike
create class pulser
which extends bike implements BikeInfo () diff
 */

class Bike {
	String colour = "Black";
	int speed = 80;

	public void BikeInfo()

	{
		System.out.println( "bike "+colour+ " is " + " " + speed);

	}
	
	

}

class pulser extends Bike
{

	public void BikeInfo()
	{
		System.out.println(colour+" "+speed);
	}
	

	
	
}

public class AssignmentBike {

	public static void main(String[] args) {
		
		Bike b=new Bike();
		b.BikeInfo();
		
		
		pulser p=new pulser();
		p.BikeInfo();
		
		
		
	}

}
