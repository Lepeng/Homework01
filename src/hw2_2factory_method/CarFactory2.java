package hw2_2factory_method;
/*
 * �½�Car_2Ʒ�Ƶ���������ʵ����
 */
public class CarFactory2 implements ICarFactory{
	
	public ICar produceCar() {
		
		Car2 car_2=new Car2();
		car_2.setName("car_2");
		car_2.setSpeed(400);
		
		return car_2;
		
	}
}
