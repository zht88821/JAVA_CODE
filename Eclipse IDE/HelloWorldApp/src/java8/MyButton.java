package java8;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyButton extends JButton {
	MyButton(String text){
		super(text);
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.red);
		int width = getWidth();
		int height = getHeight();
		g.drawOval(4,4,width-8,height-8);        //绘制椭圆
	}
}
