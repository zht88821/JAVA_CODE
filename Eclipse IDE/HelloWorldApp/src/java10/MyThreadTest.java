package java10;

public class MyThreadTest {
	public static void main(String args[]) {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"\t"+i);
			if(i==5) {
				TwoThread t1 = new TwoThread();
				Thread thread1 = new Thread(t1,"线程1");
				Thread thread2 = new Thread(t1,"线程2");
						thread1.start();
						thread2.start();
							
			
			}
		}
	}

}
