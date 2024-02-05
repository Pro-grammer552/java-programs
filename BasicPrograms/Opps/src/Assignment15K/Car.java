package Assignment15K;

class Engine {
	private String engineType;

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
}

public class Car {
	private int modeelNumber;
	private String carName;
	private double price;
	private Engine engine;

	public Car(int modelNumber, String carName, double price, Engine engine) {
		this.modeelNumber = modelNumber;
		this.carName = carName;
		this.price = price;
		this.engine = engine;
	}

	public int getModelNumber() {
		return modeelNumber;
	}

	public void setModelNumber(int modelNumber) {
		this.modeelNumber = modelNumber;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public static void main(String[] args) {
		Engine engine1 = new Engine();
		engine1.setEngineType("Electric");

		Car car1 = new Car(101, "Volvo", 100000,engine1 );

		System.out.println(car1.getCarName());
		System.out.println(car1.getModelNumber());
		System.out.println(car1.getPrice());
		
		
		System.out.println("Engine Type: " + car1.getEngine().getEngineType());
	}
}
