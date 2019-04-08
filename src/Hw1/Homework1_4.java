package Hw1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
/**
 * 
 * @author yihangRen
 *1�� �������100������ĸ��������ŵ��������Ļ�ϴ�ӡ������

 *2�� �ҳ��������������5�����֣���Ļ�ϴ�ӡ������

 *3�� �ѵ�1��������������һ���ļ�random_numbers.txt�У�ÿ��������һ�У�

 *4�� �ӵ�3����ļ��������ַŽ��������������������򣬰�����������������ļ�sorted_numbers.txt��ÿ������һ�У�

 *5�� ����һ��ѧ���࣬����������ߣ��������100��ѧ����Ϣ���ŵ����������100��ѧ�����鰴���������Ȼ��������ļ�students.txt��ÿ����һ�У�

 */
public class Homework1_4 {

	static File inputFile = new File("random_numbers.txt");
	static File outputFile = new File("sorted_numbers.txt");
	static File studentsFile = new File("students.txt");

	public static void main(String []args) throws IOException {

		Homework1_4 h = new Homework1_4();
		//����100������������ŵ������ﲢ��ӡ
		float []arr1 = h.FloatRand();
		//ȡ����ǰ�������ӡ����
		h.FindMaxN(arr1,5);
		//��100�������д��random_numbers.txt�ļ���
		h.PutInFile(arr1,inputFile);
		//��100���������random_numbers.txt��������������У���������������д��sorted_numbers.txt��
		float []arr2 = h.PutInArray();
		h.PutInFile(arr2, outputFile);
		//�������100��ѧ����Ϣ,�ŵ����������100��ѧ�����鰴���������
		Student s=new Student();
		//Ȼ��������ļ�students.txt��ÿ����һ��
		h.PutInFile(s.RandomInfo(), studentsFile);
	}
	
	public float[] FloatRand () {
	    /**
	     * �������100������ĸ��������ŵ��������Ļ�ϴ�ӡ������
	     **/
		float []arr=new float[100];
		System.out.println("********100����������£�***********");
		for(int i=0;i<100;i++) {
			arr[i]=(float)Math.random();
			System.out.println(arr[i]);
		}
		return arr;
	}
	

	public float[] createHeap(float[] a, int k) {
	     /**
	     * ����k���ڵ��С����
	     */
	     float[] result = new float[k];
	     for (int i = 0; i < k; i++) {
	    	 result[i] = a[i];
	    	 }
	     for (int i = 1; i < k; i++) {
	         int child = i;
	         int parent = (i - 1) / 2;
	         float temp = a[i];
	         while (parent >= 0 &&child!=0&& result[parent] >temp) {
	        	 result[child] = result[parent];
	             child = parent;
	             parent = (parent - 1) / 2;
	             }
	         result[child] = temp;
	         }
	     return result;
	
	}
	
	
	public void insert(float[] heap, float a) {
        heap[0]=a;
        int parent=0;
        
        while(parent<heap.length){
            int lchild=2*parent+1;
            int rchild=2*parent+2;
            int minIndex=parent;
            if(lchild<heap.length&&heap[parent]>heap[lchild]){
                minIndex=lchild;
            }
            if(rchild<heap.length&&heap[minIndex]>heap[rchild]){
                minIndex=rchild;
            }
            if(minIndex==parent){
                break;
            }else{
                float temp=heap[parent];
                heap[parent]=heap[minIndex];
                heap[minIndex]=temp;
                parent=minIndex;
            }
        }
        
   }

   public float[] getTopKByHeap(float[] a, int k) {
       float heap[] = this.createHeap(a, k);
       for(int i=k;i<a.length;i++){
           if(a[i]>heap[0]){
               this.insert(heap, a[i]);
           }
       
           
       }
       return heap;

   }
   
	public float[] FindMaxN(float a[],int n) {
		/**
		 * �ҳ��������������n�����֣���Ļ�ϴ�ӡ������
		 */
        float result[] = new Homework1_4().getTopKByHeap(a, n);
        System.out.println("******Top"+n+"����Ϊ��*********");
        for (float temp : result) {
            System.out.println(temp);
        }
        return result;
	}
	
	
	public void PutInFile (float arr[],File file) throws IOException {
		/**
		 * �ѵ�1��������������һ���ļ�random_numbers.txt�У�ÿ��������һ��
		 */
		FileWriter out = new FileWriter(file);
		for(int i=0;i<100;i++){
			out.write(arr[i]+"\r\n");
		}	
	    out.close();
	}
	
	public void PutInFile (Student st[],File file) throws IOException {
		/**
		 * �ѵ�1��������������һ���ļ�students.txt�У�ÿ��������һ��
		 */
		FileWriter out = new FileWriter(file);
		for(int i=0;i<100;i++){
			out.write(toString(st[i])+"\r\n");
		}	
	    out.close();
	}
	

	public String toString(Student st){
		/**
		 * ��дToSting����
		 */
		
        return "Student[����: " + st.getName() + " , ���: " + st.getHeight() + " ]";
    }

	
	public float[] PutInArray() throws IOException {
	
        float []result = new float[100];
        try{
            BufferedReader br = new BufferedReader(new FileReader(inputFile));//����һ��BufferedReader������ȡ�ļ�
            int i=0;
            String s = null;
            while((s = br.readLine())!=null){//ʹ��readLine������һ�ζ�һ��
                result[i++]=Float.parseFloat(s);
            }
            br.close();    
        }catch(Exception e){
            e.printStackTrace();
        }
        Arrays.sort(result);
        return result;
	}
}
