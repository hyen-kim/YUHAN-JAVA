import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboTest extends JFrame {
	public ComboTest() {
		setLayout(new FlowLayout());
		JLabel l1 = new JLabel("식사 : ");
		JLabel l2 = new JLabel("음료 : ");
		String[] strMeals = {"토마토파스타", "스테이크", "샐러드", "갈비탕", "불고기"};
		String[] strDrinks = {"화이트와인", "레드와인", "콜라", "사이다", "웰치스"};
		
		JComboBox<String> comboM = new JComboBox<String>(strMeals);
		JComboBox<String> comboD = new JComboBox<String>(strDrinks);
		
		add(l1); add(comboM);
		add(l2); add(comboD);
		
		setTitle("JComboBox 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 250, 400, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ComboTest();
	}
}
