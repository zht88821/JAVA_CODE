package java8;
import java.awt.*;
import javax.swing.*;
public class ActionEventDemo2 {
	public static void main(String args[]) {
		JFrame frame = new JFrame("ActionEvent Demo2");
		MyButton b = new MyButton("Close");    //创建自定义的组件MyButton的实例
		frame.getContentPane().add(b,BorderLayout.CENTER);   //添加按钮
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
}
}