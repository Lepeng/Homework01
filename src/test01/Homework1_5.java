package test01;
/**
 * 
 * @author yihangRen
 *�����ַ�����Java is a general-purpose computer-programming language�� ������仰�����г��ֵ���ĸ�����ֵĴ�����
 */
public class Homework1_5 {

	public static void main(String []args) {
		String str="Java is a general-purpose computer-programming language";
		int count=0;
		char arr[]=str.toCharArray();
		int n=str.length();
		for(int i=0;i<n;i++) {
			
			count=str.length()-str.replace(arr[i]+"", "").length();
			str=str.replace(arr[i]+"","" );
			System.out.println(arr[i]+"��"+count);
			arr=str.toCharArray();
			n=arr.length;
			i=-1;
		}
	}
}
