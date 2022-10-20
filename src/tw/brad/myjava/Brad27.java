package tw.brad.myjava;


import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Brad27 extends JFrame{// Brad27 object is-a JFame
	// Brad27 object has-a
	private JButton b1,b2,b3;
	public Brad27() {//建構式 初始化Brad27
		//super()
		super("My Window");
		b1 = new JButton("B1");
		b2 = new JButton("B2");
		b3 = new JButton("B3");
		
		setLayout(new FlowLayout());
		add(b1);add(b2);add(b3);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Brad27();//建立Brad27
	}

}
