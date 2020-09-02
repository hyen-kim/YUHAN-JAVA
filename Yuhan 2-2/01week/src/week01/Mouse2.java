package week01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mouse2 extends JFrame implements MouseListener {

	JLabel lbl;
	JButton btn;
	
	public Mouse2() {
		setLayout(new FlowLayout());
		setTitle("마우스 이벤트 프로그래밍");
		lbl = new JLabel("마우스 버튼를 동작시키세요.");
		btn = new JButton("마우스로 클릭해보세요.");
		add(lbl);
		add(btn);
		btn.addMouseListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(400, 200, 500, 300);
		setVisible(true);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		lbl.setText("버튼이 클릭되었습니다.");
		lbl.setForeground(Color.RED);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		lbl.setText("버튼에 마우스가 들어왔습니다.");
		btn.setBackground(Color.BLUE);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		lbl.setText("버튼에서 빠져나왔습니다.");
		btn.setBackground(Color.YELLOW);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		lbl.setText("버튼이 눌렸습니다.");
		btn.setForeground(Color.BLACK);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	public static void main(String[] args) {
		new Mouse2();

	}

}
