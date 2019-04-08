package Hw2_1_singleton;
/*
 * дһ���࣬������Ӧ�������ֻ����һ������ʵ������singletonģʽ��
 * Ҫ�� 
 * 1�� ������ⲿ������ͨ��new��������Ķ��� 
 * 2�� ��������࣬Ҳ����ͨ��new��������Ķ���
 * 3�� ��ø������ķ����������̰߳�ȫ�ģ�
 */

public class Singleton {
	
	private static Singleton instance = new Singleton();
	/**
	 * Ҳ���þ�̬�����
	 * private static Singleton instance;
	 * 
	 * static{
	 * instance = new Singleton();
	 * }
	 */
	
	//��캯��Ϊ˽��,ʹ�����޷���ʵ����
	private Singleton() {}
	
	//��ȡΨһ���õĶ���
	public static Singleton getInstance() {
		return instance;
	}

	//��ӡ��Ϣ
	public void print() {
		System.out.print("singletonģʽ��");
	}
	
	//��������򵥵�һ��----����ʽ,�����߳�ͬ�����⵫�˷��ڴ�
	
	/*
	 *Ҳ��������˫�ؼ�飬�̰߳�ȫ����Ч�ʽϸ�,����ʹ���ڴ�

    	private static volatile Singleton instance;

    	private Singleton() {}

    	public static Singleton getInstance() {
        	if (instance == null) {
	            synchronized (Singleton.class) {
	                if (instance == null) {
	                    instance = new Singleton();
	                }
	            }
	        }
        return  instance ;
    	}

	 */
}
