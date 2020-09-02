package week01;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseMotion2 extends JFrame implements MouseListener, MouseMotionListener {
	
	JLabel lbl;
	
	public MouseMotion2() {
		setLayout(new FlowLayout());
		
		lbl = new JLabel();
		addMouseListener(this);
		addMouseMotionListener(this);
		
		add(lbl);
		setTitle("MouseListener & MouseMotionListener");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(600, 200, 500, 400);
		setVisible(true);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		lbl.setText("마우스가 드래그됩니다. (" + e.getX() + ", " + e.getY() + ")");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		lbl.setText("마우스가 이동됩니다. (" + e.getX() + ", " + e.getY() + ")");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		lbl.setText("마우스가 클릭됩니다. (" + e.getX() + ", " + e.getY() + ")");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		lbl.setText("마우스가 들어왔습니다. (" + e.getX() + ", " + e.getY() + ")");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		lbl.setText("마우스가 나갔습니다.");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		lbl.setText("마우스가 눌러졌습니다.");
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	public static void main(String[] args) {
		new MouseMotion2();
	}

}
