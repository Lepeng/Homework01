package hw2_2builder;

public class Car1Builder implements ICarBuilder{

	Car car;
	
	public Car1Builder() {
		car = new Car();
	}
	
	public void buildCarBody() {
		car.setCarBody("新的车身");
	}
	
	public void buildCarNumber() {
		car.setCarNumber("沪A8888");
	}
	
	public void buildCarAbility() {
		car.setCarAbility("速度很快");
	}
	
	public Car createCar() {
		return car;
	}
}
