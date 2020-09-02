import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class ListTest extends JFrame {
	public ListTest() {
		setLayout(new FlowLayout());
		
		JLabel l1 = new JLabel("과일선택 : ");
		String[] strlists = {"참외", "수박", "포도", "자두", "오렌지"};
		JList<String> list = new JList<String>(strlists);
		
		add(l1);
		add(list);
		
		setTitle("JList 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 250, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ListTest();
	}
}
