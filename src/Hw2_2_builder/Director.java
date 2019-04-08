package Hw2_2_builder;

public class Director {

	public Car createCarByDirector(ICar_builder cb) {
		
		cb.buildCarAbility();
		cb.buildCarBody();
		cb.buildCarNumber();
		return cb.createCar();
		
	}
}
