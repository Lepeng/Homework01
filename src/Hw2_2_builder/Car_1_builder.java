package Hw2_2_builder;

public class Car_1_builder implements ICar_builder{

	Car car;
	
	public Car_1_builder() {
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
