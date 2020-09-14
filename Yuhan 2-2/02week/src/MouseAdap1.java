import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdap1 extends JFrame {

	JLabel lbl;
	public MouseAdap1() {
		setTitle("Adapter 클래스 사용");
		setLayout(new FlowLayout());
		
		lbl = new JLabel("마우스를 조작해보세요.");
		add(lbl);
		
		addMouseListener(new MyMouseAdapter());
		addMouseMotionListener(new MyMouseMotionAdapter());
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(800, 200, 500, 300);
		setVisible(true);
	
	
	}
	
	// 클래스 안에 클래스를 만든다. -> 내부 클래스
	class MyMouseAdapter extends MouseAdapter{
		// addMouseListener의 처리자
		@Override
		public void mouseClicked(MouseEvent e) {
			lbl.setText("마우스가 클릭되었습니다.");
		}
	}
	
	class MyMouseMotionAdapter extends MouseMotionAdapter{
		@Override
		public void mouseDragged(MouseEvent e) {
			lbl.setText("마우스가 드래그되었습니다. : (" + e.getX() + ", " + e.getY() + ")");
		}
	}
	
	
	public static void main(String[] args) {
		new MouseAdap1();
	}

}
