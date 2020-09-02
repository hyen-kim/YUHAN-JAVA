package swingEx;

import java.awt.Window;

import javax.swing.JFrame;

public class JFrameTest extends JFrame {
	
	public JFrameTest() {
		setTitle("첫 번째 윈도우"); 	// 제목표시줄
//		setSize(500, 300); 		// 넓이, 높이
//		setLocation(300, 300);  // setLocation + setSize : 윈도우 창을 원하는 위치에 표시
		setBounds(300, 300, 500, 300);  // 원하는 위치, 원하는 크기
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 윈도우 창을 닫았을 때 프로그램 종료
		setVisible(true); 		// 화면에 보이게
	}
	
	public static void main(String[] args) {
		new JFrameTest();	// 기본 생성자 호출
	}
}
