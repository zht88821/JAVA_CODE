package java10;

public class TwoThread implements Runnable {
	private int i;
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println(Thread.currentThread().getName()+"\t"+i);
			if(i==20) {
				System.out.println(Thread.currentThread().getName()+"\t"+"over");
			}
		}
	}

}
