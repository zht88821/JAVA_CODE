package java9;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MenuDemo implements ItemListener,ActionListener {
	JFrame frame = new JFrame("Menu Demo");
	JTextField tf = new JTextField();
	public static void main(String args[]) {
		MenuDemo menuDemo = new MenuDemo();
		menuDemo.go();
	}
	public void go() {
		JMenuBar menubar = new JMenuBar();       //菜单栏
		frame.setJMenuBar(menubar);
		JMenu menu,submenu;          //菜单和子菜单
		JMenuItem menuItem;          //菜单项
		menu = new JMenu("File");     //建立File菜单
		menu.setMnemonic(KeyEvent.VK_F);    //设置快捷键
		menubar.add(menu);
		menuItem = new JMenuItem("Open...");   //菜单中的菜单项
		menuItem.setMnemonic(KeyEvent.VK_0);       //设置快捷键
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,ActionEvent.ALT_MASK));       //设置加速键
		menuItem.addActionListener(this);      //注册侦听器
		menu.add(menuItem);
		menuItem = new JMenuItem("Save",KeyEvent.VK_S);
		menuItem.addActionListener(this);       //注册侦听器
		menuItem.setEnabled(false);             //设置为不可用
		menu.add(menuItem);
		menuItem = new JMenuItem("Close");
		menuItem.setMnemonic(KeyEvent.VK_C);
		menuItem.addActionListener(this);   //注册侦听器
		menu.add(menuItem);
		menu.add(new JSeparator());    //加入分隔线
		menuItem = new JMenuItem("Exit");
		menuItem.setMnemonic(KeyEvent.VK_E);
		menuItem.addActionListener(this);          //注册侦听器
		menu.add(menuItem);
		menu = new JMenu("Option");         //建立Option菜单
		menubar.add(menu);
		menu.add("Font...");             //Option中的菜单项
		submenu = new JMenu("Color...") ;          //建立子菜单
		menu.add(submenu);
		menuItem = new JMenuItem("Foreground");
		menuItem.addActionListener(this);           //注册侦听器
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2,ActionEvent.ALT_MASK));    //设置加速键
		submenu.add(menuItem);
		menuItem = new JMenuItem("Background");
		menuItem.addActionListener(this);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3,ActionEvent.ALT_MASK));
		submenu.add(menuItem);
		menu.addSeparator();
		JCheckBoxMenuItem cm = new JCheckBoxMenuItem("Always On Top");
		cm.addItemListener(this);
		menu.add(cm);
		menu.addSeparator();
		JRadioButtonMenuItem rm = new JRadioButtonMenuItem("Small",true);
		rm.addItemListener(this );
		menu.add(rm);
		ButtonGroup group = new ButtonGroup();
		group.add(rm);
		rm = new JRadioButtonMenuItem("Large");
		rm.addItemListener(this);
		menu.add(rm);
		group.add(rm);
		menu = new JMenu("Help");   //建立Help菜单
		menubar.add(menu);
		menuItem = new JMenuItem("about...",new ImageIcon("dukeWaveRed.gif"));
		menuItem.addActionListener(this);
		menu.add(menuItem);
		tf.setEditable(false);
		Container cp = frame.getContentPane();
		cp.add(tf,BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,200);
		frame.setVisible(true);		
	}
	public void itemStateChanged(ItemEvent e) {
		int state = e.getStateChange();
		JMenuItem amenuItem= (JMenuItem)e.getSource();
		String command = amenuItem.getText();
		if(state==ItemEvent.SELECTED)
			tf.setText(command+"SELECTED");
		else
			tf.setText(command+"DESELECTED");
	}
	public void actionPerformed(ActionEvent e) {
		tf.setText(e.getActionCommand());
		if(e.getActionCommand()=="Exit") {
			System.exit(0);
		}
	}

}
