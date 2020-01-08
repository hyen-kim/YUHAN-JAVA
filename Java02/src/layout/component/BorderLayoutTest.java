package layout.component;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;

import layout.window.CenterWindow;


public class BorderLayoutTest extends JFrame {
	// 버튼 다섯개를 배열안에 넣어둠.
	JButton[] buts = new JButton[5];

	public BorderLayoutTest() {
		// 버튼에 간격
		setLayout(new BorderLayout(20, 20));
		// 버튼의 위치 : 북, 남, 동, 서, 중앙
		String[] constraints = {"North","South", "East", "West", "Center"};
		for(int i = 0; i < buts.length; i++) {
			buts[i] = new JButton("버튼"+(i+1));
			add(buts[i], constraints[i]);		// 추가
		}
		int w = 300, h = 400;
		Point p = CenterWindow.getCenterLocation(w, h);
		setBounds(p.x, p.y, w, h);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderLayoutTest();

	}

}
