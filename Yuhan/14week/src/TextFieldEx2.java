import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldEx2 extends JFrame{
	public TextFieldEx2() {
		// 작은 상자 역할 (컨테이너)
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));	
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
		JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));	// 기본적으로 5
		
		JLabel l1 = new JLabel("성명 : ");
		JLabel l2 = new JLabel("전화번호 : ");
		JLabel l3 = new JLabel("주소 : ");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(20);
		JTextField t3 = new JTextField("실제 살고 있는 주소 기입", 35);
		
		// 첫번째 상자에 성명 다음에 텍스트 필드가 오게 추가
		p1.add(l1); p1.add(t1);
		// 두번째 상자에 전화번호와 텍스트 필드가 오게 추가
		p2.add(l2); p2.add(t2);
		// 세번째 상자에 주소와 텍스트 필드가 오게  추가
		p3.add(l3); p3.add(t3);
		
		
		// 큰 상자에 작은 상자 두개를 추가	--> 대소문자 꼭 구별
		add(p1, "North");
		add(p2, "Center");	// 위치 Center는 생략 가능
		add(p3, "South");
		
		setTitle("JTextField 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 200, 500, 250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextFieldEx2();
	}
	
}
