package layout.component;
import java.awt.Color;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import layout.window.CenterWindow;

public class JPanelTest extends JFrame {
	JPanel pan1, pan2;
	JButton[] buts = new JButton[4];
	
	public JPanelTest() {
		//배치관리자 제거
		setLayout(null);
		pan1 = new JPanel();
		pan2 = new JPanel();
		pan1.setBounds(100, 50, 200, 150);
		pan2.setBounds(0, 200, 200, 100);
		pan1.setBackground(Color.red);
		pan2.setBackground(Color.yellow);
		add(pan1, "Center");
		add(pan2, "South");
		for(int i = 0; i < buts.length; i++) {
			buts[i] = new JButton("버튼" + (i+1));
			if(i<2) {
				pan1.add(buts[i]);
			}
			
			else {
				pan2.add(buts[i]);
			}
		}
		
		int w = 300, h = 400;
		Point p = CenterWindow.getCenterLocation(w, h);
		setBounds(p.x, p.y, w, h);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JPanelTest();
	}

}
