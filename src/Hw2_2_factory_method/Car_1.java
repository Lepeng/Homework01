package Hw2_2_factory_method;
/*
 * �½�Car_1����ʵ����
 */
public class Car_1 extends Car_base{

	public void start() {
		
		System.out.println(this.getName() + "��������,�ٶ�Ϊ��" + this.getSpeed());
	
	}
		
	public void stop() {
		
		System.out.println(this.getName() + "��ͣ����");
	
	}
	
}
