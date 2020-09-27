import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ArithmeticTest extends JFrame implements ActionListener {

	JTextField t1, t2, t3;
	JButton [] btns = new JButton[4];
	
	
	public ArithmeticTest() {
		setTitle("사칙 연산");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		
		String[] btnStrs = {"+", "-", "*", "/"};
		
		for (int i = 0; i < btnStrs.length; i++) {
			btns[i] = new JButton(btnStrs[i]);
			btns[i].addActionListener(this); 
			p2.add(btns[i]);
		}
		
		p1.add(t1); p1.add(t2);
		
		add(p1, "North");
		add(p2, "Center");
		add(t3, "South");
		
		setBounds(900, 200, 500, 300);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		double d1, d2, d3;
		
		d1 = Double.parseDouble(t1.getText()); 
		d2 = Double.parseDouble(t2.getText());
		
		if (e.getSource() == btns[0]) {
			d3 = d1 + d2;
			t3.setText(d1 + "+" + d2 + "=" + d3);
		}
		if (e.getSource() == btns[1]) {
			d3 = d1 - d2;
			t3.setText(d1 + "-" + d2 + "=" + d3);
		}
		if (e.getSource() == btns[2]) {
			d3 = d1 * d2;
			t3.setText(d1 + "*" + d2 + "=" + d3);
		}
		if (e.getSource() == btns[3]) {
			d3 = d1 / d2;
			t3.setText(d1 + "/" + d2 + "=" + d3);
		}

	}

	public static void main(String[] args) {
		new ArithmeticTest();

	}

}
