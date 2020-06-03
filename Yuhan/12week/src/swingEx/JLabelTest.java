package swingEx;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelTest extends JFrame {
	
	public JLabelTest() {
		
		// Layout의 배치관리자 변경
		setLayout(new FlowLayout());
		
		// JLabel은 보통 화면에 출력하기 위한 컴포넌트
		JLabel lbl1 = new JLabel("JLabel");
		JLabel lbl2 = new JLabel("실습");
		
		add(lbl1);	
		add(lbl2);
		
		//add(lbl1, "North");	// North 같이 사용할 수 있는 경우는 border 레이아웃일 경우
		// add(lbl2, "South");
		
		setTitle("JLabel 컴포넌트 연습");
		setBounds(250, 200, 600, 400);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JLabelTest();	// 위의 생성자 호출
	}
}
