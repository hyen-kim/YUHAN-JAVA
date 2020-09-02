import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaTest extends JFrame{
	public TextAreaTest() {
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		
		JLabel l1 = new JLabel("이름 : ");
		JLabel l2 = new JLabel("제목 : ");
		JLabel l3 = new JLabel("내용 : ");
		
		JTextField t1 = new JTextField(7);
		JTextField t2 = new JTextField(20);
		JTextArea ta = new JTextArea(7, 30);	// 7행 30열
		
		p1.add(l1); p1.add(t1);
		p2.add(l2); p2.add(t2);
		p3.add(l3); p3.add(ta);
		
		add(p1, "North");
		add(p2, "Center");
		add(p3, "South");
		
		setTitle("JTextArea 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 250, 500, 250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextAreaTest();
	}
}
