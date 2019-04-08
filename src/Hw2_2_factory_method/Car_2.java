package Hw2_2_factory_method;
/*
 * 新建Car_2具体实现类
 */
public class Car_2 extends Car_base{
	
	public void start() {
		
		System.out.println(this.getName() + "车启动了,速度为：" + this.getSpeed());
	
	}
	
	public void stop() {
		
		System.out.println(this.getName() + "车停车了");
	
	}

}
