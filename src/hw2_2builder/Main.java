package hw2_2builder;

public class Main {
	public static void main(String[] args) {
		
		Director dir = new Director();
		Car car = dir.createCarByDirector(new Car1Builder());
		System.out.println(car.getCarBody());
		System.out.println(car.getCarNumber());
		System.out.println(car.getCarAbility());
		
	}

}
