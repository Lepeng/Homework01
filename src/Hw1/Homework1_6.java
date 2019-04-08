package Hw1;

import java.util.HashMap;
import java.util.Iterator;

/**
 * 
 * @author yihangRen
 *网上随便复制一段英文，要求算出每个单词出现的次数
 */
public class Homework1_6 { 
		
	
		public static void main(String[] args) {
			
			String str="to be , or not to be, that is a question";
			 
			HashMap<String, Integer> h=new HashMap<>();    //定义一个双列集合
			String [] str1=str.split(" ");                                               //分割成若干字符串
			 
			for (int i = 0; i < str1.length; i++) {                                  //判断每个字符串，是存在于集合里
				if (!h.containsKey(str1[i])) {
					h.put(str1[i], 1);				                  //如果不存在，则存进去 比如   Hello:1
				}else {
					Integer count=h.get(str1[i]);                        //如果存在 ，先找到 此key对应的 value值
					h.put(str1[i], count+1);		                 //覆盖前者的的key值，并且比前者多加一次
				}
			}
			 
			//遍历
			Iterator<String> it=h.keySet().iterator();                    //获取HashMap所有的key集合并遍历
			while(it.hasNext()) {
				String keyName=it.next();
				System.out.println(keyName+":"+h.get(keyName)+"次");
				 
			}
		}
	}




