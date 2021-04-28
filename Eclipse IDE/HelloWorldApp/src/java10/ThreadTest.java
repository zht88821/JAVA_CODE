package java10;

public class ThreadTest {
	static Lefthand left;
	static Righthand right;
	public static void main(String[]args) {
		left = new Lefthand();         //创建两个线程
		right = new Righthand();
		left.start();
		right.start();          //创建两个线程
	}

}
