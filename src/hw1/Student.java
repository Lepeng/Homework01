package hw1;

import java.util.Arrays;
import java.util.Random;
/**
 * 
 * @author yihangRen
 * ����һ��ѧ���࣬�����������
 */
public class Student implements Comparable<Student>{
	private String name;
	private int height;
	
    private static String firstName="��Ǯ��������֣��������������������������ʩ�ſײ��ϻ���κ�ս���л������ˮ��������˸��ɷ�����³Τ������ﻨ������Ԭ��ۺ��ʷ�Ʒ����Ѧ�׺����������ޱϺ�����������ʱ��Ƥ���뿵����Ԫ������ƽ�ƺ�������Ҧ��տ����ë����ױ���갼Ʒ��ɴ�̸��é���ܼ�������ף������������ϯ����ǿ��·¦Σ��ͯ�չ�÷ʢ�ֵ�����������Ĳ��﷮���������֧�¾̹�¬Ī�������Ѹɽ�Ӧ�������ڵ��������������ʯ�޼�ť�������ϻ���½��������춻���κ�ӷ����ഢ���������ɾ��θ����ڽ��͹�����ɽ�ȳ������ȫۭ�����������������ﱩ�����������������ղ����Ҷ��˾��۬�輻��ӡ�ް׻���̨�Ӷ����̼���׿�����ɳ����������ܲ�˫��ݷ����̷�����̼������Ƚ��۪Ӻȴ�ɣ���ţ��ͨ�����༽ۣ����ũ�±�ׯ�̲����ֳ�Ľ����ϰ�°���������������θ����߾Ӻⲽ�����������Ŀܹ�»�ڶ�Ź�����εԽ��¡ʦ�������˹��������������Ǽ��Ŀ�����ɳؿ������ᳲ�������󽭺�����Ȩ�ָ��滸����ٹ˾���Ϲ�ŷ���ĺ�������˶��������ʸ�ξ�ٹ����̨��ұ���������������̫����������������ԯ�������������Ľ����������˾ͽ˾������˾���붽�ӳ�����ľ����������������ṫ���ذμй��׸����������ַ���۳Ϳ�նθɰ��ﶫ�����ź��ӹ麣����΢����˧�ÿ�������������������������Ĳ��٦�����Ϲ�ī�������갮��١�����Ը��ټ�����";  
    private static String secondName="���Ӣ���������Ⱦ���������֥��Ƽ�����ҷ���ʴ��������÷���������滷ѩ�ٰ���ϼ����ݺ�����𷲼Ѽ�������������Ҷ�������������ɺɯ������ٻ�������ӱ¶������������Ǻɵ���ü������ޱݼ���Է�ܰ�������԰��ӽ�������ع���ѱ�ˬ������ϣ����Ʈ�����������������������ܿ�ƺ������˿ɼ���Ӱ��֦˼�� ΰ�����㿡��ǿ��ƽ�����Ļ�������������־��������ɽ�ʲ���������Ԫȫ��ʤѧ��ŷ���������ɱ�˳���ӽ��β��ɿ��ǹ���ﰲ����ï�����м�ͱ벩���Ⱦ�����׳��˼Ⱥ���İ�����ܹ����ƺ���������ԣ���ܽ���������ǫ�����֮�ֺ��ʲ����������������ά�������������󳿳�ʿ�Խ��������׵���ʱ̩ʢ��衾��ڲ�����ŷ纽��";  

	
	Student(String name,int height){
		this.name=name;
		this.height=height;
	}
	
	Student() {
	}
	
	String getName() {
		return this.name;
	}
	
	int getHeight() {
		return this.height;
	}
	
    public static int getNum(int start,int end) {  
        return (int)(Math.random()*(end-start+1)+start);  
    }  
	
	public String getRandomName() {
        int index=getNum(0, firstName.length()-1);  
        String first=firstName.substring(index, index+1);
        int index1=getNum(0, secondName.length()-1); 
        String second=secondName.substring(index1, index1+1); 
        return first+second;  

	}
	
	public int getRandomHeight() {
		Random r=new Random();
		int h = (int)(r.nextInt(300)+1600) / 10;
		return h;
	}
	
	public Student[] RandomInfo(){
		Student st[]=new Student[100];
		for (int i = 0; i < 100; i++) {
			st[i] = new Student(getRandomName(), getRandomHeight());
		//	System.out.println(st[i].name +st[i].height);
		
		}
		Arrays.sort(st);
		for (int i = 0; i < 100; i++) {
			System.out.println(st[i].name +"  "+st[i].height);
		
		}
		return st;
	}

	@Override
	public int compareTo(Student st) {
		if (this.height > st.height){
			return 1;
		}else if(this.height < st.height){
			return -1;
}
		return 0;
	}

	
	//public 
}
