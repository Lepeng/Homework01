package Hw2_2_factory_method;
/*
 * ʵ��factory methodģʽ������-----�ͻ�������
 * ���Խ�����Ĵ����ӳٵ��������ʵ������ÿ������������ͬƷ�Ƶ�������ÿ�������Ĺ������Լ���ר��ʵ��
 */
public class Main {

	public static void main(String[] args) {
		
		ICar_factory_interface car_factory = new Car_1_factory();
		ICar_interface car = car_factory.produceCar();
		car.start();
		car.stop();
		
	}
}
