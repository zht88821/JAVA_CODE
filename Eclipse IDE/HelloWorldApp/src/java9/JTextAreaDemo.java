package java9;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class JTextAreaDemo {
	JFrame frame = new JFrame("JTextArea Demo");
	JTextArea ta1,ta2;
	JButton copy,clear;
	public static void main(String args[]) {
		JTextAreaDemo tad = new JTextAreaDemo();
		tad.go();
	}
	public void go() {
		ta1 = new JTextArea(3,15);
		ta1.setSelectedTextColor(Color.red);     //设置选中的文本颜色为红色
		ta2 = new JTextArea(7,20);
		ta2.setEditable(false);   //设置为不可编辑的
		JScrollPane jsp1 = new JScrollPane(ta1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		JScrollPane jsp2 = new JScrollPane(ta2,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		copy = new JButton("Copy");
		//将ta1中选中文本或所有内容复制到ta2中
		copy.addActionListener(new ActionListener() {     //相应Copy按钮上的事件
			public void actionPerformed(ActionEvent e) {
				if(ta1.getSelectedText()!=null)
					ta2.append(ta1.getSelectedText()+"\n");
				else
					ta2.append("\n"+ta1.getText()+"\n");
			}
			
		});
		clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {  //响应clear按钮上的事件
			public void actionPerformed(ActionEvent e) {
				ta2.setText("");
			}
			
		});
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		Border etchedBase = BorderFactory.createEtchedBorder();   //设置一个基础边框、
		Border etched1 = BorderFactory.createTitledBorder(etchedBase,"输入区");     //为边框加标题
		Border etched2 = BorderFactory.createTitledBorder(etchedBase,"复制区");		//加标题
		panel1.setBorder(etched1);        //为组件添加边框
		panel2.setBorder(etched2);
		panel1.add(jsp1);
		panel1.add(copy);
		panel2.add(jsp2);
		panel2.add(clear);
		Container cp = frame.getContentPane();
		cp.add(panel1,BorderLayout.CENTER);
		cp.add(panel2,BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
