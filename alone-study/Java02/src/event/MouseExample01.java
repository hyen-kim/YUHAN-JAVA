package event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseExample01 extends JFrame {
	
	JPanel panel = new JPanel();
	JLabel Label = new JLabel();
	
	MouseExample01() {
		setTitle("마우스 좌표 출력");
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.add(Label);		// 기본 Border layout 적용
		panel.addMouseMotionListener(new MouseMotionListener() {	// 익명 클래스 
			
			@Override
			public void mouseMoved(MouseEvent e) {
				Integer x = e.getX();
				Integer y = e.getY();
				String str = "X : " + x.toString() + "Y : " + y.toString();
				Label.setText(str);
			}	
			@Override
			public void mouseDragged(MouseEvent e) {
	
			}
		});
		add(panel);			// panel을 JFrame에 붙여줌
	}
	public static void main(String[] args) {
		MouseExample01 event = new MouseExample01();
	}
}
