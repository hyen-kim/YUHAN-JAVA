import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Action3 extends JFrame implements ActionListener {
	JButton btn;
	JTextField t1, t2;
	JLabel lbl;
	
	public Action3() {
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		btn = new JButton("연결");
		t1 = new JTextField(15);
		t2 = new JTextField(15);
		lbl = new JLabel("2개의 텍스트 필드에 문자열을 입력해주세요.");
		
		p1.add(btn);
		p2.add(t1); p2.add(t2);
		add("North", p1);
		add("Center", p2);
		add("South", lbl);
		btn.addActionListener(this);
		
		setTitle("문자열 연결");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(900, 200, 500, 300);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String result = t1.getText() + " " + t2.getText();
		lbl.setText(result);

	}

	public static void main(String[] args) {
		new Action3();

	}

}
