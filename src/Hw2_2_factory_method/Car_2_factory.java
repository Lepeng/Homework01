package Hw2_2_factory_method;
/*
 * �½�Car_2Ʒ�Ƶ���������ʵ����
 */
public class Car_2_factory implements ICar_factory_interface{
	
	public ICar_interface produceCar() {
		
		Car_2 car_2=new Car_2();
		car_2.setName("car_2");
		car_2.setSpeed(400);
		
		return car_2;
		
	}
}
