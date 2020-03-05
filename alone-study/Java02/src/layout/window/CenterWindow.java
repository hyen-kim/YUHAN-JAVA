package layout.window;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;

public class CenterWindow {

	
	public static Point getCenterLocation(int w, int h) {
		Toolkit t = Toolkit.getDefaultToolkit();
		Dimension d = t.getScreenSize();
		int sw = d.width;
		int sh = d.height;
		int x = (int)(1.0/2*(sw-w));
		int y = (int)(1.0/2*(sh-h));
		Point pCenter = new Point(x, y);
		return pCenter;
	}
}