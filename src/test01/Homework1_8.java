package test01;
/**
 * 
 * @author yihangRen
 *用循环同时启动10个线程，每一个线程在屏幕上打印一条包含自己标识的文本信息。 
 *多次运行该程序，观察到打印的文本信息是否与该线程启动的顺序 不一致，设置公正锁使让信息打印的顺序与线程启动的顺序一致

 */
public class Homework1_8 implements Runnable{ 
		
		private int index=0;
//		定义需要传入的LockObject对象
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
//          判断该资源是否被占用
			synchronized(lock){
//				如果资源空闲，则判断是否已经打印完成
				while(lock.flag <= lock.MaxValue){
//					没有打印完则判断是否是自己需要打印信息
					if(lock.flag == index){
						System.out.println(Thread.currentThread().getName());
						lock.flag ++;
						if(lock.flag==10){
							System.out.println("线程打印完毕");
						}
//						打印完毕后，唤醒所有的线程
						lock.notifyAll();
						break;
					}else{
						try {
//							不是该线程打印的数字，则继续等待
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
 * 设置一个锁对象
 */
class LockObject{
	int flag = 0;
	final int MaxValue=9;
}


