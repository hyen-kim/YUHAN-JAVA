
public class Circle {
	// 필드	=> 기본적으로 private으로 지정
	private double circum, area;
	private int r;
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public double getCircum() {
		return circum;
	}
	public double getArea() {
		return area;
	}
	
	// 원의 둘레 : 2*pi*r
	public void calcCircum() {
		circum = 2 * Math.PI * r;
	}
	
	// 원의 면적 : pi * r * r
	public void calcArea() {
		area = Math.PI * Math.pow(r, 2);
	}
	
}
