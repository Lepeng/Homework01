package Hw2_3_observer;

import java.util.Observer;
import java.util.Observable;

public class Console_observer implements Observer{

	@Override
	public void update(Observable o, Object arg1) {
		
		Console_observable c=(Console_observable) o;
		System.out.println("文本改变为：" +c.getData());
		
	}
	
}
