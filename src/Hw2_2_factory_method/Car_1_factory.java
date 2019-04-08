package Hw2_2_factory_method;
/*
 * 新建Car_1品牌的汽车工厂实现类
 */
public class Car_1_factory implements ICar_factory_interface{

	public ICar_interface produceCar() {

		Car_1 car_1=new Car_1();
		car_1.setName("car_1");
		car_1.setSpeed(500);
		
		return car_1;
		
	}
}
