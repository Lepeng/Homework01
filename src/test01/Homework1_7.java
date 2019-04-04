package test01;
/**
 * 
 * @author yihangRen
 *写一个递归算法，把字符串反转，比如字符串“hello”反转后是“olleh”
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
