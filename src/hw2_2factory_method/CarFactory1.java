package hw2_2factory_method;
/*
 * �½�Car_1Ʒ�Ƶ���������ʵ����
 */
public class CarFactory1 implements ICarFactory{

	public ICar produceCar() {

		Car1 car_1=new Car1();
		car_1.setName("car_1");
		car_1.setSpeed(500);
		
		return car_1;
		
	}
}
