package Hw2_2_builder;

public class Car_1_builder implements ICar_builder{

	Car car;
	
	public Car_1_builder() {
		car = new Car();
	}
	
	public void buildCarBody() {
		car.setCarBody("�µĳ���");
	}
	
	public void buildCarNumber() {
		car.setCarNumber("��A8888");
	}
	
	public void buildCarAbility() {
		car.setCarAbility("�ٶȺܿ�");
	}
	
	public Car createCar() {
		return car;
	}
}
