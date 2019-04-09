package hw2_3;

import java.util.Scanner;

public class ConsolePrint {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("输入的文本为：" + s.nextLine());
		}
		
	}
	
}
