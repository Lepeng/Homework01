package Hw2_3_observer;

import java.util.Observer;
import java.util.Observable;

public class Console_observer implements Observer{

	@Override
	public void update(Observable o, Object arg1) {
		
		Console_observable c=(Console_observable) o;
		System.out.println("�ı��ı�Ϊ��" +c.getData());
		
	}
	
}
