package Hw1;

import java.util.HashMap;
import java.util.Iterator;

/**
 * 
 * @author yihangRen
 *������㸴��һ��Ӣ�ģ�Ҫ�����ÿ�����ʳ��ֵĴ���
 */
public class Homework1_6 { 
		
	
		public static void main(String[] args) {
			
			String str="to be , or not to be, that is a question";
			 
			HashMap<String, Integer> h=new HashMap<>();    //����һ��˫�м���
			String [] str1=str.split(" ");                                               //�ָ�������ַ���
			 
			for (int i = 0; i < str1.length; i++) {                                  //�ж�ÿ���ַ������Ǵ����ڼ�����
				if (!h.containsKey(str1[i])) {
					h.put(str1[i], 1);				                  //��������ڣ�����ȥ ����   Hello:1
				}else {
					Integer count=h.get(str1[i]);                        //������� �����ҵ� ��key��Ӧ�� valueֵ
					h.put(str1[i], count+1);		                 //����ǰ�ߵĵ�keyֵ�����ұ�ǰ�߶��һ��
				}
			}
			 
			//����
			Iterator<String> it=h.keySet().iterator();                    //��ȡHashMap���е�key���ϲ�����
			while(it.hasNext()) {
				String keyName=it.next();
				System.out.println(keyName+":"+h.get(keyName)+"��");
				 
			}
		}
	}




