package hw2_2factory_method;
/*
 * �½�Car_2����ʵ����
 */
public class Car2 extends BaseCar{
	
	public void start() {
		
		System.out.println(this.getName() + "��������,�ٶ�Ϊ��" + this.getSpeed());
	
	}
	
	public void stop() {
		
		System.out.println(this.getName() + "��ͣ����");
	
	}

}
