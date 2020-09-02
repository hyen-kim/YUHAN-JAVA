package swingEx;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelTest extends JFrame{
	
	public JPanelTest(){
		setTitle("JFrame 연습");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
	
		p1.setBackground(Color.YELLOW);
		p2.setBackground(Color.PINK);
	
		p1.setBounds(0, 0, 400, 150);
		p2.setBounds(0, 150, 400, 150);
		
		add(p1);
		add(p2);
		
		setSize(400, 400); // JFrame의 사이즈
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JPanelTest();
	}
}
