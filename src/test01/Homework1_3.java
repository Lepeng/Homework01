package test01;

public class Homework1_3 {

	public static void main(String []args) {
		int n=(int)((Math.random()*9+1)*100000000);
		System.out.println(n);
		for(int i=1;i<=9;i++) {
			int m=(int)Math.pow(10,9-i);
			System.out.println((n/m)%10);
		}
	}
}
