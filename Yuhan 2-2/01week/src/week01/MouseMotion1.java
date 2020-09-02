package week01;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MouseMotion1 extends JFrame implements MouseMotionListener {
	JLabel lbl;
	public MouseMotion1() {
		setLayout(new FlowLayout());
		lbl = new JLabel("마우스를 드래그 또는 움직이세요.");
		add(lbl);
		addMouseMotionListener(this);
		setTitle("MouseMotionListener 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(500, 200, 500, 300);
		setVisible(true);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		lbl.setText("드래그 되고 있음 : " + e.getX() + ", " + e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		lbl.setText("움직이고 있음 : " + e.getX() + ", " + e.getY());
	}

	public static void main(String[] args) {
		new MouseMotion1();
	}
}
