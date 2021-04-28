package java8;
import java.awt.*;
import javax.swing.*;
public class JFrameDemo {
	public static void main(String s[ ]) {
		JFrame frame = new JFrame("JFrameDemo");
		//创建一个JFrame的实例，有标题
		JButton button= new JButton("Press me");
		//创建一个JButton实例，按钮上有文字
		frame.getContentPane().add(button,BorderLayout.CENTER);
		//将按钮放到JFrame的中央
		frame.pack();
		//将JFrame设置为适当大小
		frame.setVisible(true);
		//显示JFrame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//退出时关闭窗口。
	}

}
