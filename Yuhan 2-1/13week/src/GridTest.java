import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridTest extends JFrame {
	public GridTest() {
		setLayout(new GridLayout(4, 3)); // 4행 3열 -> 수평 수직을 주고 싶다면 뒤에 값 추가
		String[] call = {"*", "0", "#"};
		
		JButton[] btns = new JButton[12];

		for (int i = 0; i < btns.length; i++) {
			if (i < 9) {
				btns[i] = new JButton(i + 1 + ""); // 정수형을 넣을 수 없기때문에 문자열형으로 바꿈
			}else {
				btns[i] = new JButton(call[i-9]);
			}
			add(btns[i]);
		}
//		btns[9].setLabel("*");
//		btns[10].setLabel("0");
//		btns[11].setLabel("#");

		setTitle("키패드");

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 200, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridTest();
	}
}
