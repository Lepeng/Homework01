package test01;
/**
 * 
 * @author yihangRen
 *дһ���ݹ��㷨�����ַ�����ת�������ַ�����hello����ת���ǡ�olleh��
 */

public class Homework1_7 {

	public static void main(String []args) {
		String Str="hello";
		System.out.print(ReverseStr(Str));
	}
	
	public static String ReverseStr(String str) {
        if(str.length() <= 1){
            return str;
        }
        return ReverseStr(str.substring(1)) + str.charAt(0);
	}

}
