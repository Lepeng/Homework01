package hw2_3observer;

import java.util.Observer;
import java.util.Observable;

public class ConsoleObserver implements Observer{

	@Override
	public void update(Observable o, Object arg1) {
		
		ConsoleObservable c=(ConsoleObservable) o;
		System.out.println("�ı��ı�Ϊ��" +c.getData());
		
	}
	
}
