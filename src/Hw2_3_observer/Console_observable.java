package Hw2_3_observer;

import java.util.Observable;
import java.util.Scanner;

public class Console_observable extends Observable{
	
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
