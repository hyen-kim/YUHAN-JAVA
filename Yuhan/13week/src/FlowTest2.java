import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowTest2 extends JFrame {
	
	public FlowTest2() {	// 기본 생성자
		// setLayout(new FlowLayout());
		// 레이아웃위치, 수평, 수직
		setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 30));	
		String[] strBtn = {"가", "나", "다", "라", "마"};
		JButton[] btns = new JButton[strBtn.length];
		
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton(strBtn[i]);
			add(btns[i]);
		}
		
		setTitle("FlowLayout 연습");
		
		setBounds(200, 150, 300, 200);	// 넓이 높이 / 윈도우화면좌표	
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new FlowTest2();		// 기본 생성자를 호출하여 객체 생성
	}
}
