package java10;

public class Lefthand extends Thread {
	public void run() {                  //线程体
		for(int i=0;i<=5;i++) {
			System.out.println("I am Lefthand!");     //输出六次信息
			try {
				sleep(500);               //线程等待一会儿
			}catch(InterruptedException e) { }
		}
	}

}
