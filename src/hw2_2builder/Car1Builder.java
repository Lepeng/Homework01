package hw2_2builder;

public class Car1Builder implements ICarBuilder{

	Car car;
	
	public Car1Builder() {
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
