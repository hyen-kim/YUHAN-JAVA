import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.omg.PortableInterceptor.ACTIVE;

public class Action2 extends JFrame implements ActionListener {
	JButton btn1, btn2;
	JLabel lbl;
	
	public Action2() {
		setTitle("하나의 handler(처리자) 객체 사용");
		setLayout(new FlowLayout());
	
		btn1 = new JButton("여자");
		btn2 = new JButton("남자");
		lbl = new JLabel("버튼을 선택하세요.");
		
		add(btn1);
		add(btn2);
		add(lbl);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(900, 200, 150, 300);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			lbl.setText("여자버튼이 선택되었습니다.");
		}else{
			lbl.setText("남자버튼이 선택되었습니다.");
		}

	}

	public static void main(String[] args) {
		new Action2();
	}

}
