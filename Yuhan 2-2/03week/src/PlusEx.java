import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PlusEx extends JFrame implements ActionListener {
	JButton btn;
	JTextField t1, t2;
	JLabel lb;

	public PlusEx() {
		setTitle("µ¡¼À ¿¬»ê");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		btn = new JButton("PLUS");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		lb = new JLabel("* µÎ ½Ç¼öÀÇ µ¡¼À °á°ú´Â : ");
		p1.add(btn);
		p2.add(t1);
		p2.add(t2);
		
		add(p1, "North");
		add(p2, "Center");
		add(lb, "South");
		
		btn.addActionListener(this);
		
		setBounds(900, 200, 500, 300);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		double d1 = 0, d2 = 0, d3 = 0;
		if(e.getSource() == btn) {
			d1 = Double.parseDouble(t1.getText());
			d2 = Double.parseDouble(t2.getText());
			d3 = d1 + d2;
			lb.setText("* µÎ½Ç¼öÀÇ µ¡¼À °á°ú : " + d3);
		}
	}

	public static void main(String[] args) {
		new PlusEx();

	}

}
