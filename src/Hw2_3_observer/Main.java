package Hw2_3_observer;

public class Main {

	public static void main(String[] args) {
		
		Console_observable console=new Console_observable();
		console.addObserver(new Console_observer());
		while(true) {
			console.changeData();
		}
		
	}
	
}
