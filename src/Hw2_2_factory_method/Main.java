package Hw2_2_factory_method;
/*
 * 实现factory method模式的例子-----客户端运行
 * 可以将对象的创建延迟到子类进行实例化，每个工厂创建不同品牌的汽车，每个汽车的功能有自己的专门实现
 */
public class Main {

	public static void main(String[] args) {
		
		ICar_factory_interface car_factory = new Car_1_factory();
		ICar_interface car = car_factory.produceCar();
		car.start();
		car.stop();
		
	}
}
