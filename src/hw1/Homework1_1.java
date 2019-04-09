package hw1;

import java.util.HashSet; 
import java.util.Set; 

public class Homework1_1 {
	public static void main(String [] args) {
		Object []arr= {10, 25, 11, 23, 10, 10, 9, 9, 2, 3, 11, 31};

		Set<Integer> set=new HashSet<Integer>();//实例化一个set集合
		for(int i=0;i<arr.length;i++) {
		set.add((Integer) arr[i]);
		}
		arr = set.toArray();
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		
	}
	

}
