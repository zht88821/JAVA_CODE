package java8;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JButtonExample extends WindowAdapter implements ActionListener{
	JFrame f;
	JButton b;
	JTextField tf;
	int tag = 0;
	public static void main(String args[ ]) {
		JButtonExample be = new JButtonExample(); be.go();
	}
		
	
	private void go() {
		f = new JFrame("JButton Example");
		b = new JButton("Sample");
		b.addActionListener(this);
		f.getContentPane().add(b,"South");
		tf = new JTextField();
		f.getContentPane().add(tf,"Center");
		f.addWindowListener(this);
		f.setSize(300,150);
		f.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String s1 = "You have pressed the Button!";
		String s2 = "You do another time";
		if(tag == 0) {
			tf.setText(s1);tag=1;
		}
		else {
			tf.setText(s2);tag=0;
		}
		
		
	}
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	

}
