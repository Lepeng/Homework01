package hw2_2factory_method;
/*
 * ʵ��factory methodģʽ������-----�ͻ�������
 * ���Խ�����Ĵ����ӳٵ��������ʵ������ÿ������������ͬƷ�Ƶ�������ÿ�������Ĺ������Լ���ר��ʵ��
 */
public class Main {

	public static void main(String[] args) {
		
		ICarFactory car_factory = new CarFactory1();
		ICar car = car_factory.produceCar();
		car.start();
		car.stop();
		
	}
}
