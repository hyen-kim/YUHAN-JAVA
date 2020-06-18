import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextTest extends JFrame{
	public TextTest() {
		// 작은 상자 역할 (컨테이너)
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));	// 왼쪽 정렬
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));

		JLabel l1 = new JLabel("성명 : ");
		JLabel l2 = new JLabel("전화번호 : ");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(20);
		
		// 첫번째 상자에 성명 다음에 텍스트 필드가 오게 추가
		p1.add(l1); p1.add(t1);
		// 두번째 상자에 전화번호와 텍스트 필드가 오게 추가
		p2.add(l2); p2.add(t2);
		
		// 큰 상자에 작은 상자 두개를 추가	--> 대소문자 꼭 구별
		add(p1, "North");
		add(p2, "Center");	// 위치 Center는 생략
		
		
		setTitle("JTextField 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 200, 500, 250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextTest();
	}
	
}
