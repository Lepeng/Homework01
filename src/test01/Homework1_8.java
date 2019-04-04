package test01;
/**
 * 
 * @author yihangRen
 *��ѭ��ͬʱ����10���̣߳�ÿһ���߳�����Ļ�ϴ�ӡһ�������Լ���ʶ���ı���Ϣ�� 
 *������иó��򣬹۲쵽��ӡ���ı���Ϣ�Ƿ�����߳�������˳�� ��һ�£����ù�����ʹ����Ϣ��ӡ��˳�����߳�������˳��һ��

 */
public class Homework1_8 implements Runnable{ 
		
		private int index=0;
//		������Ҫ�����LockObject����
		private LockObject lock;
		
		public Homework1_8(int index, LockObject lock){
			this.index = index;
			this.lock = lock;
		}
		
		public static void main(String[] args) {
			LockObject lock = new LockObject();
			for (int i = 0; i < 10; i++){
				Homework1_8 h=new Homework1_8(i, lock);
				Thread t=new Thread(h);
				t.start();
			}
		}
		
		@Override
		public  void run() {
//          �жϸ���Դ�Ƿ�ռ��
			synchronized(lock){
//				�����Դ���У����ж��Ƿ��Ѿ���ӡ���
				while(lock.flag <= lock.MaxValue){
//					û�д�ӡ�����ж��Ƿ����Լ���Ҫ��ӡ��Ϣ
					if(lock.flag == index){
						System.out.println(Thread.currentThread().getName());
						lock.flag ++;
						if(lock.flag==10){
							System.out.println("�̴߳�ӡ���");
						}
//						��ӡ��Ϻ󣬻������е��߳�
						lock.notifyAll();
						break;
					}else{
						try {
//							���Ǹ��̴߳�ӡ�����֣�������ȴ�
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
				}
				
			}
			
		}
		  
		 

	}
/**
 * ����һ��������
 */
class LockObject{
	int flag = 0;
	final int MaxValue=9;
}


