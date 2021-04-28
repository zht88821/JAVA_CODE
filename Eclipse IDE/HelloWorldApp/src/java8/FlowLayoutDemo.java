package java8;
import java.awt.*;
import javax.swing.*;
public class FlowLayoutDemo {
	private JFrame frame;
	private JButton button1,button2,button3;
	public static void main(String args[]) {
		FlowLayoutDemo that = new FlowLayoutDemo();
		that.go();
	}
	public void go() {
		frame = new JFrame("Flow Layout");
		Container contentPane = frame.getContentPane();  //内容窗格
		contentPane.setLayout(new FlowLayout());  //为内容窗格设置FlowLayout布局管理器
		button1 = new JButton("Ok");
		button2 = new JButton("Open");
		button3 = new JButton("Close");
		contentPane.add(button1);     //向内容窗格中添加3个按钮
		contentPane.add(button2);
		contentPane.add(button3);
		frame.setSize(200,100);    //设定窗口大小
		frame.setVisible(true);      //显示窗口
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
