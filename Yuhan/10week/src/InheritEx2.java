class CircleA{
	double area;
	public void GetArea(double r) {
		area = 3.14 * r * r;
	}
}

class CircleB extends CircleA{
	double circum;
	public void GetCircum(double r) {
		circum = 2 * 3.14 * r;
	}
}


public class InheritEx2 {
	public static void main(String[] args) {
		CircleB c = new CircleB();
		c.GetArea(3.5);
		c.GetCircum(3.5);
		System.out.println("반지름 3.5인 원의 넓이 : " + c.area);
		System.out.println("반지름 3.5인 원의 둘레 : " + c.circum);
	}
}
