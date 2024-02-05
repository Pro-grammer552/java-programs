package LabHomeWork18_07;

/*
WAP to create class Vehicle with methods accelerate(long mph)
 with long type parameter ,stop(),run() all method return string type of value.
  Create class car which extends Vehicle implement accelerate(long mph)differently in car class.
 */

class Vehicle {
	public long accelerate(long mph) {
		return mph;
	}

	public String stop() {
		return "Stop";
	}

	public String run() {
		return "Run";
	}
}


class car extends Vehicle
{
	
	public long accelerate(long mph) {
		return mph;
	}

}

public class VechicalCar {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		System.out.println(v.accelerate(250));
		
		String s1=v.run();
		System.out.println(s1);
		
		String s2=v.stop();
		System.out.println(s2);
		
		car c=new car();
		System.out.println(c.accelerate(450));
		
		
		
		

	}

}








