package hw2_2factory_method;
/*
 * �½�Car_1����ʵ����
 */
public class Car1 extends BaseCar{

	public void start() {
		
		System.out.println(this.getName() + "��������,�ٶ�Ϊ��" + this.getSpeed());
	
	}
		
	public void stop() {
		
		System.out.println(this.getName() + "��ͣ����");
	
	}
	
}
