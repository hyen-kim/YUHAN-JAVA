
public class RunCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.setR(7);
		
		Circle c2 = new Circle();
		c2.setR(12);
		
		c1.calcCircum();
		c1.calcArea();
		
		c2.calcCircum();
		c2.calcArea();
		
		System.out.printf("반지름이 %d인 원의 둘레 : %.1fcm\n", c1.getR(), c1.getCircum());
		System.out.printf("반지름이 %d인 원의 면적 : %.1fcm\n", c1.getR(), c1.getArea());
		
		System.out.printf("반지름이 %d인 원의 둘레 : %.1fcm\n", c2.getR(), c2.getCircum());
		System.out.printf("반지름이 %d인 원의 면적 : %.1fcm\n", c2.getR(), c2.getArea());
	}
}