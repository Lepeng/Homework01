package hw2_2factory_method;
/*
 * 新建Car_1品牌的汽车工厂实现类
 */
public class CarFactory1 implements ICarFactory{

	public ICar produceCar() {

		Car1 car_1=new Car1();
		car_1.setName("car_1");
		car_1.setSpeed(500);
		
		return car_1;
		
	}
}
