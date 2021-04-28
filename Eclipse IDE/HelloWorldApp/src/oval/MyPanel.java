package oval;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyPanel extends JPanel implements ActionListener {
	JTextField text;  int width,height;   int posX,posY,radius;
	MyPanel(){
		setLayout(new BorderLayout());    
		text = new JTextField(10);
		add(text,BorderLayout.NORTH);
		text.addActionListener(this);
	}
	public void paintComponent(Graphics g) {
		g.setColor(Color.red);
		g.drawOval(posX, posY, radius*2, radius*2);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==text) {
			int r = Integer.parseInt(text.getText());
			width = this.getWidth(); height = this.getHeight();
			posX = width/2-r;  posY = height/2-r;
			radius = r;
			repaint();
		}
	}
}
