import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioTest extends JFrame {
	public RadioTest() {
		setLayout(new FlowLayout());
		
		ButtonGroup bg = new ButtonGroup();
		String[] strRds = {"IT소프트웨어", "유아교육", "경영정보", "관광"};
		JRadioButton[] rds = new JRadioButton[strRds.length];
		
		for (int i = 0; i < rds.length; i++) {
			rds[i] = new JRadioButton(strRds[i]);
			bg.add(rds[i]);
			add(rds[i]);
		}
		
		rds[0].setSelected(true);
		
		setTitle("JRadioButton 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 250, 400, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new RadioTest();
	}
}
