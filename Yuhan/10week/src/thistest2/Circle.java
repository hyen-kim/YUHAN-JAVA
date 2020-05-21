package thistest2;

public class Circle {
	private int r;
	private double circum, area;

	public Circle(int r) {
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public double getCircum() {
		return circum;
	}

	public double getArea() {
		return area;
	}

	public void calcCircum() {
		circum = 2 * Math.PI * r;
	}
	
	public void calcArea() {
		area = Math.PI * Math.pow(r, 2);	
	}
	
	public void printCircle() {
		RunCircle.showResult(this);
		// 현재 객체의 값을 showResult에 값을 전달하여라
		
	}
}
