package Talk;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class TalkMain {
	private static JTextField YID;
	private static JTextField YPW;
	public static void main(String[] args) {
		
		JFrame j = new JFrame();
		j.getContentPane().setBackground(new Color(240, 255, 240));
		
		// 화면 창 이름
		j.setTitle("Yuhan Talk");
		
		// 창 사이즈
		j.setSize(580, 690);
		j.getContentPane().setLayout(null);
		
		
		YID = new JTextField();
		YID.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 18));
		YID.setText("Username");
		YID.setBounds(77, 313, 414, 53);
		j.getContentPane().add(YID);
		YID.setColumns(10);
		
		
		JButton login = new JButton("LOGIN");
		login.setForeground(new Color(255, 255, 255));
		login.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		login.setBackground(Color.LIGHT_GRAY);
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 로그인 버튼 클릭 시
				JOptionPane.showMessageDialog(null, "로그인 성공");
				
			}
		});
		
		login.setBounds(77, 440, 414, 53);	// 로그인 버튼 위치
		j.getContentPane().add(login);		// 로그인 버튼 추가
		
		JButton join = new JButton("JOIN");
		join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 회원가입 버튼 클릭 시
			}
		});
		join.setForeground(new Color(255, 255, 255));
		join.setBackground(Color.LIGHT_GRAY);
		join.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		join.setBounds(77, 495, 414, 53);
		j.getContentPane().add(join);
		
		YPW = new JTextField();
		YPW.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 18));
		YPW.setHorizontalAlignment(SwingConstants.LEFT);	// 글자를 왼쪽부터
		YPW.setText("PassWord");
		YPW.setBounds(77, 372, 414, 53);
		j.getContentPane().add(YPW);
		YPW.setColumns(10);
		
		JLabel title = new JLabel("Yuhan Talk");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setForeground(new Color(102, 205, 170));
		title.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 50));
		title.setBounds(59, 26, 414, 114);
		j.getContentPane().add(title);

		

		
		j.setResizable(true); // 프레임 크기 고정
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 종료버튼 활성화
		j.setVisible(true);	// 창 보이기
	}
}
