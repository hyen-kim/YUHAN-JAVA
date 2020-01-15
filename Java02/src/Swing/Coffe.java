package Swing;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Coffe {
	static class setGUI extends JFrame {

		// 생성자를 통해 GUI 초기 세팅을 해준다.
		setGUI() {
			// 윈도우 제목(Title)을 생성
			setTitle("Coffe Test");
			// 종료 버튼 생성
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


			// FlowLayout을 설정
			this.setLayout(new FlowLayout());

			// 레이블 생성
			JLabel lb1 = new JLabel("원하는 커피 선택");
			this.add(lb1);

			// 라디오 버튼 생성
			JRadioButton rd1 = new JRadioButton("아메리카노");
			JRadioButton rd2 = new JRadioButton("카페모카");
			JRadioButton rd3 = new JRadioButton("에스프레소");
			JRadioButton rd4 = new JRadioButton("카페라떼");
			
			// 1번 라디오 버튼 눌러져있도록
			rd1.setSelected(true);
			
			// 라디오 버튼을 그룹화 하기위한 객체 생성
			ButtonGroup groupRd = new ButtonGroup();

			// 그룹에 라디오 버튼 포함시킨다.
			groupRd.add(rd1);
			groupRd.add(rd2);
			groupRd.add(rd3);
			groupRd.add(rd4);

			this.add(rd1);
			this.add(rd2);
			this.add(rd3);
			this.add(rd4);
			
			// 레이블 생성 
			JLabel lbcount = new JLabel("수량"); 
			JLabel lbmoney = new JLabel("입금액"); 
			// 텍스트 필드 생성
			JTextField count = new JTextField( 10 );   
			JTextField money = new JTextField( 10 );  
			
			this.add(lbcount);
			this.add(count);
			this.add(lbmoney);
			this.add(money);
			
			JTextArea content= new JTextArea(7,40); 
			JScrollPane s= new JScrollPane(content); 
			this.add(s);
			
			// 윈도우 창 크기 설정(가로, 세로)
			setSize(500, 300);

			// 이 메소드를 이용해야 윈도우 창이 나타난다.
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		// 프레임 열기
		new setGUI();
	}
}