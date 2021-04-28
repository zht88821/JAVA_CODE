package java10;

public class Righthand extends Thread {
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("I am Righthand"); //输出6次信息
			try {
				sleep(300);     //线程等待一会儿
			}catch(InterruptedException e) {}
		}
	}

}
