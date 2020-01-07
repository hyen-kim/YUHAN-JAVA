package layout.component;

import java.awt.FlowLayout;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;

import layout.window.CenterWindow;

public class FlowLayoutTest extends JFrame {
	JButton[] buts = new JButton[10];

	public FlowLayoutTest() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));
		for(int i = 0; i < buts.length; i++) {
			buts[i] = new JButton("¹öÆ°"+(i+1));
			add(buts[i]);
		}
		int w = 300, h = 400;
		Point p = CenterWindow.getCenterLocation(w, h);
		setBounds(p.x, p.y, w, h);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowLayoutTest();

	}

}
