package hw2_2factory_method;
/*
 * �½��������࣬ʵ��������Ʒ�ӿ�
 */
public class BaseCar implements ICar{

	private int speed;
	private String name;
	
	public void setSpeed(int speed) {
		
		this.speed=speed;
	
	}
	
	public int getSpeed() {
		
		return speed;
	
	}
	
	public void setName(String name) {
		
		this.name=name;
	
	}
	
	public String getName() {
		
		return name;
	
	}
	
	
	
	public void start() {}
	
	public void stop() {}
}
