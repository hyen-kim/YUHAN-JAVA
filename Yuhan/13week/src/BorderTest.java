import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderTest extends JFrame{
	
	public BorderTest() {
		setLayout(new BorderLayout(20, 30));	// 컴포넌트의 간격을 설정
		String[] strBtn = {"North", "South", "East", "West", "Center"};
		JButton[] btns = new JButton[strBtn.length];
		
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton(strBtn[i]);
			add(btns[i],strBtn[i]);	
			// 위치를 지정하지 않으면 center에 들어가므로
			// 위치를 정확하게 지정해야한다.
		}
		
		setTitle("BorderLayout 연습");
		
		setBounds(200, 200, 500, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new BorderTest();	// 객체를 생성하면서 기본생성자 호출
	}
}
