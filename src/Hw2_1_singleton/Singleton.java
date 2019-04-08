package Hw2_1_singleton;
/*
 * 写一个类，该类在应用中最多只能有一个对象实例，即singleton模式，
 * 要求： 
 * 1） 该类的外部，不能通过new创建该类的对象； 
 * 2） 该类的子类，也不能通过new创建该类的对象；
 * 3） 获得该类对象的方法必须是线程安全的；
 */

public class Singleton {
	
	private static Singleton instance = new Singleton();
	/**
	 * 也可用静态代码块
	 * private static Singleton instance;
	 * 
	 * static{
	 * instance = new Singleton();
	 * }
	 */
	
	//令构造函数为私有,使该类无法被实例化
	private Singleton() {}
	
	//获取唯一可用的对象
	public static Singleton getInstance() {
		return instance;
	}

	//打印信息
	public void print() {
		System.out.print("singleton模式！");
	}
	
	//上述是最简单的一种----饿汉式,避免线程同步问题但浪费内存
	
	/*
	 *也可用懒汉双重检查，线程安全，且效率较高,合理使用内存

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
