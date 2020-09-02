package swingEx;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelEx1 extends JFrame {
	
	private JLabel lb1, lb2;
	
	public LabelEx1() {	// 기본생성자
		setLayout(new FlowLayout()); // Label 을 양 옆으로 배치하기 위해
		lb1 = new JLabel("성명 : ");
		lb2 = new JLabel("주민번호 : ");
		
		add(lb1);
		add(lb2);
		
		setTitle("라벨 예제");
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LabelEx1();
	}
}
