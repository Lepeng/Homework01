package hw2_3observer;

public class Main {

	public static void main(String[] args) {
		
		ConsoleObservable console=new ConsoleObservable();
		console.addObserver(new ConsoleObserver());
		while(true) {
			console.changeData();
		}
		
	}
	
}
