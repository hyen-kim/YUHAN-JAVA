import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderFlowTest extends JFrame{

	public BorderFlowTest() {
		JPanel pan1 = new JPanel();
		JPanel pan2 = new JPanel();
		JPanel pan3 = new JPanel();
		pan1.setBackground(Color.GRAY);
		pan3.setBackground(Color.DARK_GRAY);
		
		String[] strNames = {"강감찬", "이순신", "홍길동", "성춘향", "이몽룡"};
		JButton[] btnNames = new JButton[strNames.length];
		
		for (int i = 0; i < strNames.length; i++) {
			btnNames[i] = new JButton(strNames[i]);
		}
		
		// panel 에 JButton을 추가
		pan1.add(btnNames[0]);	pan1.add(btnNames[1]);
		pan2.add(btnNames[2]);	
		pan3.add(btnNames[3]);	pan3.add(btnNames[4]);
		
		add(pan1, "North");
		add(pan2, "Center");
		add(pan3, "South");
		
		setTitle("Border And Flow 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 250, 300, 160);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderFlowTest();
	}
}
