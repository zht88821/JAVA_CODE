package java8;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyPanel extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int xpoints[]= {280,300,320,290,260};
		int ypoints[]= {120,120,130,150,130};
		int tag=1;
		if(tag==0) {
			tag=1;
			g.setColor(Color.blue);     //设置颜色
			g.drawLine(40,25,30,50);     //绘制直线
			g.setColor(Color.green);
			g.drawRect(100, 50, 100, 46);   //矩形
			g.setColor(Color.red);
			g.drawRoundRect(73,32,56,37,10,16);   //圆角矩形
			g.setColor(Color.yellow);
			g.fillOval(180, 60, 60, 45);     //填充椭圆
			g.setColor(Color.pink);
			g.fillArc(250,32,90,60,15,30);   //填充圆弧
			g.setColor(Color.magenta);
			g.fillPolygon(xpoints,ypoints,5);   //填充多边形
			g.setColor(Color.red);
			g.fillRect(10,110,80,30);
			g.setColor(Color.green);
			g.fillRect(50,120,80,30);
			g.setXORMode(Color.blue);
			g.fillOval(90, 130, 80, 30);
			
			
		}
		else {
			tag=0;
		}
		
	}

}
