package Hw2_2_factory_method;
/*
 * �½�Car_2����ʵ����
 */
public class Car_2 extends Car_base{
	
	public void start() {
		
		System.out.println(this.getName() + "��������,�ٶ�Ϊ��" + this.getSpeed());
	
	}
	
	public void stop() {
		
		System.out.println(this.getName() + "��ͣ����");
	
	}

}
