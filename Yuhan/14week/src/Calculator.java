// 계산기 UI 실습

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame{
	public Calculator() {
		JTextField t1 = new JTextField();
		JButton btnEq = new JButton("=");

		JPanel p1 = new JPanel(new GridLayout(4, 4));
		JButton[] btns = new JButton[16];	// 16개의 버튼 배열로 선언
		String [] strBtns = {"0", ".", "C", "+", "-", "*", "/"};
		
		
		for (int i = 0; i < btns.length; i++) {
			if(i < 9) {
				btns[i] = new JButton(i + 1 + "");
			}else {
				btns[i] = new JButton(strBtns[i-9]);
			}
			p1.add(btns[i]);
		}
		// btns[9].setText("0");	// <-- 이런 방법도 있음
		
		add(t1, "North");
		add(p1, "Center");
		add(btnEq, "South");
		
		
		setTitle("계산기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(800, 250, 250, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}
}
