import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Key2 extends JFrame implements KeyListener {
	
	JButton btn;
	int curW = 70, curH = 30;
	// 기본 생성자
	public Key2() {
		setTitle("움직이는 버튼 (방향키)");
		setLayout(null); 	// 배치관리자를 null 둠
		
		// 버튼에 대한 설정
		btn = new JButton("Move");
		btn.setBounds(50, 50, curW, curH);
		add(btn);
		
		addKeyListener(this);		// 현재 객체의 처리자를 의미하는 this 사용
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(600, 300, 500, 300);
		setVisible(true);
		
		requestFocus(); 	// 메소드 포커스를 맞춤
	}
	
	
	
	// KeyListener가 처리하는 리스너들
	@Override
	public void keyPressed(KeyEvent e) {
		// 이벤트가 발생된 키
		// 발생된 키 이벤트 e를 정수형 keyCode에 넣어줌
		int keyCode = e.getKeyCode();
		
		switch (keyCode) {
		case KeyEvent.VK_UP:	// 키 코드값 위방향키를 눌렀을 때
			btn.setLocation(btn.getX(), btn.getY()-10);
			break;
			
		case KeyEvent.VK_DOWN:	
			btn.setLocation(btn.getX(), btn.getY()+10);
			break;

		case KeyEvent.VK_LEFT:	
			if (btn.getX() != 0) {
				btn.setLocation(btn.getX()-10, btn.getY());
			}
			break;

		case KeyEvent.VK_RIGHT:	
			btn.setLocation(btn.getX()+10, btn.getY());
			break;
			
		case KeyEvent.VK_F1:	
			btn.setBackground(Color.PINK);
			break;
			
		case KeyEvent.VK_F2:
			btn.setBackground(Color.ORANGE);
			break;
			
		case KeyEvent.VK_F10:
			btn.setSize(curW + 5, curH + 5);
			curW += 5;
			curH += 5;
			break;
		
		case KeyEvent.VK_F11:
			btn.setSize(curW - 5, curH - 5);
			curW -= 5;
			curH -= 5;
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Key2();
	}

}
