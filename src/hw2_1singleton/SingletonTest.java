package hw2_1singleton;

public class SingletonTest {

	public static void main(String[] args) {
		//Hw2_1 insatnce = new Hw2_1(); 不可用
		
		//获取唯一可见对象
		Singleton instance=Singleton.getInstance();
		instance.print();
	}
}
