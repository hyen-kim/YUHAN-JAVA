import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame {
	JTextField Tf1, Tf2;
	JLabel Lab1, Lab2;
	JPanel Pan1, Pan2;
	
	public TextFieldEx() {
		setTitle("텍스트 필드 예제");
		// setLayout(new BorderLayout());
		
		Tf1 = new JTextField(10);
		Tf2 = new JTextField(20);
		
		Lab1 = new JLabel("성명 : ");
		Lab2 = new JLabel("전화번호 : ");
		
		Pan1 = new JPanel();
		Pan2 = new JPanel();
		
		Pan1.add(Lab1);
		Pan1.add(Tf1);
		Pan2.add(Lab2);
		Pan2.add(Tf2);
		
		add("North", Pan1);
		add("South", Pan2);
		
		setSize(400, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new TextFieldEx();
	}
}
