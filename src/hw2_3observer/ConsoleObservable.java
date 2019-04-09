package hw2_3observer;

import java.util.Observable;
import java.util.Scanner;

public class ConsoleObservable extends Observable{
	
	private String data = null;
	
	public String getData() {
		return data;
	}
	
	public void changeData() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		data = s.nextLine();
		setChanged();
		notifyObservers();
		
	}
	
}
