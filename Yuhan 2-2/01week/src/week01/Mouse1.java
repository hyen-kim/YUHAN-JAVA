package week01;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mouse1 extends JFrame implements MouseListener {

	JLabel lbl;
	
	public Mouse1() {
		
		setLayout(new FlowLayout());
		setTitle("마우스 이벤트 첫 번째 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		lbl = new JLabel("마우스를 조작해보세요.");
		add(lbl);
		addMouseListener(this);
		setBounds(200, 200, 500, 300);
		setVisible(true);
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		lbl.setText("마우스가 클릭되었습니다.");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		lbl.setText("마우스가 내부로 들어왔습니다.");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		lbl.setText("마우스가 외부로 나갔습니다.");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		lbl.setText("마우스 버튼이 눌렸습니다.");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		lbl.setText("마우스 버튼이 해제 되었습니다.");
	}
	
	public static void main(String[] args) {
		new Mouse1();
	}

}
