package hw2_3observer;

import java.util.Observer;
import java.util.Observable;

public class ConsoleObserver implements Observer{

	@Override
	public void update(Observable o, Object arg1) {
		
		ConsoleObservable c=(ConsoleObservable) o;
		System.out.println("文本改变为：" +c.getData());
		
	}
	
}
