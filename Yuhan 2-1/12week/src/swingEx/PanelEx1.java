package swingEx;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelEx1 extends JFrame{
	
	public PanelEx1() {
		JPanel pan1 = new JPanel();
		JPanel pan2 = new JPanel();
		
		// 배치관리자를 없앰 --> 사이즈랑, 위치설정을 무조건 해줘야함
		setLayout(null);
		
		pan1.setSize(400, 150);
		pan1.setBackground(Color.YELLOW);
		pan1.setLocation(0, 0);
		
		pan2.setSize(400, 150);
		pan2.setBackground(Color.BLUE);
		pan2.setLocation(0, 150);
		
		add(pan1);
		add(pan2);
		
		setTitle("판넬 예제");
		setSize(400, 400);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PanelEx1();
	}
}
