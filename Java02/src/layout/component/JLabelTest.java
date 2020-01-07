package layout.component;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import layout.window.CenterWindow;

public class JLabelTest extends JFrame {
	JLabel lbl1, lbl2;
	JLabel lblImg;
	JButton but1, but2;
	
	public JLabelTest() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 20, 25));
		lbl1 = new JLabel("유한대학교", JLabel.CENTER);
		lbl2 = new JLabel("IT소프트웨어공학과", JLabel.CENTER);
		ImageIcon icon = new ImageIcon("R.png");
		lblImg = new JLabel(icon);
		lbl1.setOpaque(true);
		lbl2.setOpaque(true);
		lbl1.setBackground(Color.yellow);
		lbl2.setBackground(Color.orange);
		but1 = new JButton("YUHAN");
		but2 = new JButton("ITSoftware");
		but1.setBackground(Color.black);
		but1.setForeground(new Color(255,255,255));
		add(lbl1);
		add(lbl2);
		add(lblImg);
		add(but1);
		add(but2);
		int w = 250, h = 400;
		setTitle("JLabel 연습");
		Point p = CenterWindow.getCenterLocation(w, h);
		setBounds(p.x, p.y, w, h);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JLabelTest();

	}

}
