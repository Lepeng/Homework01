package Hw2_2_factory_method;
/*
 * 新建汽车基类，实现汽车产品接口
 */
public class Car_base implements ICar_interface{

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
