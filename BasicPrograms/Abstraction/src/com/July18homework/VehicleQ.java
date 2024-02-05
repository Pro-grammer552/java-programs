package com.July18homework;

class Vehicle {
	public long acceleration(long mph) {
		return mph;
	}
	public String stop(String s) {
		return s;
	}
	public String run(String r) {
		return r;
	}
}
class Car extends Vehicle{
	public long acceleration(long mph) {
		return mph;
	}
}

public class VehicleQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		
		System.out.println(c.acceleration(250));
		System.out.println(c.stop("Stop"));
		System.out.println(c.run("run"));
	}

}
