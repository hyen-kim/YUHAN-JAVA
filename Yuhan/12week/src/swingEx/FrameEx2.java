package swingEx;

import javax.swing.JFrame;

public class FrameEx2 extends JFrame{
	FrameEx2(){
		setTitle("두 번째 윈도우");
		setSize(300, 300); 		// 윈도우 창의 가로 세로 설정
		setVisible(true);		// 윈도우 창에 표시
	}
	
	public static void main(String[] args) {
		FrameEx2 f = new FrameEx2();
	}
}
