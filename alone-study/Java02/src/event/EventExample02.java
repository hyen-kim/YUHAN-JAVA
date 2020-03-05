package event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 이벤트 리스너 (event listener)
 * 
 * (1) 개념
 * - 이벤트 리스너의 실체  : 인터페이스
 * 메소드가 정의 되어있고 인터페이스 상속으로 인해 그 내용 사용 가능
 * 
 * - 역할 : 이벤트 처리
 * 
 * - 이벤트 리스너를 사용하는 방법  	:인터페이스를 상속한 클래스 사용
 * 						    : 익명 클래스로 구현
 * 
 * (2) 이벤트 리스너 만들기
 * 1. 이벤트 리스너를 상속한 내부 클래스 구현
 *   :  내부 클래스 또는 익명 클래스
 * - 버튼의 제목을 클릭할 때마다 변경하는 예제 
 * 
 * (3) 마우스 이벤트 리스너
 * - MouseListener : 5종류 이벤트 메소드
 * - MouseMotionListener : 2종류 이벤트 메소드
 * 
 * - 처리 내용에 따라 메소드 사용
 * - 마우스 좌표를 출력하기 위해 JPanel과 JLabel 사용
 * 						
 * 
 * */

public class EventExample02 extends JFrame{
	EventExample02() {
		setTitle("swing 연습");
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		JButton button1 = new JButton("Play");
		button1.addActionListener(new MyActionListener());	// 버튼이 클릭될때마다 연동
		add(button1);
	}
	
	// 내부 클래스
	public class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton Button = (JButton)e.getSource();	// 형변환을 하여 객체를 사용
			if(Button.getText().equals("Play"))			// Play하고 같으냐 ?
				Button.setText("Stop");					// Play -> Stop
			else
				Button.setText("Play");
		}
	}
	
	
	public static void main(String[] args) {
		EventExample02 MainFrame = new EventExample02();
	}
}
