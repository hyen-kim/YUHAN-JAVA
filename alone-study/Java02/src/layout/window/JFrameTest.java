package layout.window;

import java.awt.Point;
import javax.swing.JFrame;

public class JFrameTest extends JFrame {

	public JFrameTest() {
		int w =  600, h = 500;
		Point p = CenterWindow.getCenterLocation(w, h);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(p.x, p.y, w, h);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JFrameTest();

	}

}
