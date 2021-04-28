package java8;
import java.awt.*;
import javax.swing.*;
public class BoxLayoutDemo {
	private JFrame frame;
	private JPanel pv,ph;
	public static void main(String args[]) {
		BoxLayoutDemo that = new BoxLayoutDemo();
		that.go();
	}
	void go() {
		frame = new JFrame("Box Layout example");
		Container contentPane = frame.getContentPane();
		pv = new JPanel();
		pv.setLayout(new BoxLayout(pv,BoxLayout.Y_AXIS));
		//为pv设置为垂直方向的BoxLayout
		pv.add(new JLabel("First"));
		pv.add(new JLabel("Second"));
		pv.add(new JLabel("Third"));
		contentPane.add(pv,BorderLayout.CENTER);     //将pv添加到内容窗格的中部
		ph = new JPanel();
		ph.setLayout(new BoxLayout(ph,BoxLayout.X_AXIS));
		//为ph设置为水平方向上的BoxLayout
		ph.add(new JButton("yes"));
		ph.add(new JButton("No"));
		ph.add(new JButton("cancel"));
		contentPane.add(ph,BorderLayout.SOUTH);
		//将ph添加到内容窗格的下部
		frame.pack();
		frame.setVisible(true);
	}
}
