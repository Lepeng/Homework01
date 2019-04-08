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
 *1） 随机生成100个随机的浮点数，放到数组里；屏幕上打印出来；

 *2） 找出这个数组中最大的5个数字；屏幕上打印出来；

 *3） 把第1题中随机数输出到一个文件random_numbers.txt中，每个数字是一行；

 *4） 从第3题的文件读入数字放进数组里，并对数组进行排序，把排序后的数组输出到文件sorted_numbers.txt，每个数字一行；

 *5） 创建一个学生类，有姓名，身高；随机生成100个学生信息，放到数组里；对这100个学生数组按照身高排序，然后输出到文件students.txt，每个人一行；

 */
public class Homework1_4 {

	static File inputFile = new File("random_numbers.txt");
	static File outputFile = new File("sorted_numbers.txt");
	static File studentsFile = new File("students.txt");

	public static void main(String []args) throws IOException {

		Homework1_4 h = new Homework1_4();
		//生成100随机浮点数，放到数组里并打印
		float []arr1 = h.FloatRand();
		//取最大的前五个数打印出来
		h.FindMaxN(arr1,5);
		//将100个随机数写入random_numbers.txt文件里
		h.PutInFile(arr1,inputFile);
		//将100个随机数从random_numbers.txt里读出放在数组中，对数组进行排序后写入sorted_numbers.txt中
		float []arr2 = h.PutInArray();
		h.PutInFile(arr2, outputFile);
		//随机生成100个学生信息,放到数组里；对这100个学生数组按照身高排序
		Student s=new Student();
		//然后输出到文件students.txt，每个人一行
		h.PutInFile(s.RandomInfo(), studentsFile);
	}
	
	public float[] FloatRand () {
	    /**
	     * 随机生成100个随机的浮点数，放到数组里；屏幕上打印出来；
	     **/
		float []arr=new float[100];
		System.out.println("********100个随机数如下：***********");
		for(int i=0;i<100;i++) {
			arr[i]=(float)Math.random();
			System.out.println(arr[i]);
		}
		return arr;
	}
	

	public float[] createHeap(float[] a, int k) {
	     /**
	     * 创建k个节点的小根堆
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
		 * 找出这个数组中最大的n个数字；屏幕上打印出来；
		 */
        float result[] = new Homework1_4().getTopKByHeap(a, n);
        System.out.println("******Top"+n+"个数为：*********");
        for (float temp : result) {
            System.out.println(temp);
        }
        return result;
	}
	
	
	public void PutInFile (float arr[],File file) throws IOException {
		/**
		 * 把第1题中随机数输出到一个文件random_numbers.txt中，每个数字是一行
		 */
		FileWriter out = new FileWriter(file);
		for(int i=0;i<100;i++){
			out.write(arr[i]+"\r\n");
		}	
	    out.close();
	}
	
	public void PutInFile (Student st[],File file) throws IOException {
		/**
		 * 把第1题中随机数输出到一个文件students.txt中，每个数字是一行
		 */
		FileWriter out = new FileWriter(file);
		for(int i=0;i<100;i++){
			out.write(toString(st[i])+"\r\n");
		}	
	    out.close();
	}
	

	public String toString(Student st){
		/**
		 * 重写ToSting方法
		 */
		
        return "Student[姓名: " + st.getName() + " , 身高: " + st.getHeight() + " ]";
    }

	
	public float[] PutInArray() throws IOException {
	
        float []result = new float[100];
        try{
            BufferedReader br = new BufferedReader(new FileReader(inputFile));//构造一个BufferedReader类来读取文件
            int i=0;
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
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
