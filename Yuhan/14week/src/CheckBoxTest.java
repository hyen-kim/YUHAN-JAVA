import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxTest extends JFrame {
	public CheckBoxTest() {
		setLayout(new FlowLayout());
		
		String[] strChks = {"사과", "복숭아", "포도", "참외", "수박"};
		JCheckBox[] chks = new JCheckBox[strChks.length];
		
		for (int i = 0; i < chks.length; i++) {
			chks[i] = new JCheckBox(strChks[i]);
			add(chks[i]);
		}
		
		chks[3].setSelected(true);	// 참외를 선택
		
		setTitle("체크박스 연습");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 250, 400, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CheckBoxTest();
	}
}
