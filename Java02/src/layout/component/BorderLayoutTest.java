package layout.component;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;

import layout.window.CenterWindow;


public class BorderLayoutTest extends JFrame {
	JButton[] buts = new JButton[5];

	public BorderLayoutTest() {
		setLayout(new BorderLayout(20, 20));
		String[] constraints = {"North","South", "East", "West", "Center"};
		for(int i = 0; i < buts.length; i++) {
			buts[i] = new JButton("¹öÆ°"+(i+1));
			add(buts[i], constraints[i]);
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
