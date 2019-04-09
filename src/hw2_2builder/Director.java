package hw2_2builder;

public class Director {

	public Car createCarByDirector(ICarBuilder cb) {
		
		cb.buildCarAbility();
		cb.buildCarBody();
		cb.buildCarNumber();
		return cb.createCar();
		
	}
}
