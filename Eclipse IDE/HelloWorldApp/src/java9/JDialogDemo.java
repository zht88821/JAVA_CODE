package java9;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JDialogDemo implements ActionListener {
	JFrame frame;
	JDialog dialog;
	JButton button;
	public static void main(String args[]) {
		JDialogDemo jd = new JDialogDemo();
		jd.go();
	}
	public void go() {
		frame = new JFrame("JDialog Demo");
		dialog = new JDialog(frame,"Dialog",true);
		dialog.getContentPane().add(new JLabel("Hello, I'm a Dialog"));    //添加组件
		dialog.setSize(60,40);               //设置对话框大小
		button = new JButton("Show Dialog");  
		button.addActionListener(this); //为按钮添加侦听器
		Container cp = frame.getContentPane();
		cp.add(button,BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,150);
		frame.setVisible(true);             //让对话框显示
	}
	public void actionPerformed(ActionEvent e) {
		dialog.setVisible(true);
	}

}
