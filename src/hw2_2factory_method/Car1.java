package hw2_2factory_method;
/*
 * 新建Car_1具体实现类
 */
public class Car1 extends BaseCar{

	public void start() {
		
		System.out.println(this.getName() + "车启动了,速度为：" + this.getSpeed());
	
	}
		
	public void stop() {
		
		System.out.println(this.getName() + "车停车了");
	
	}
	
}
