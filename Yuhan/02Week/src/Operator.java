
public class Operator {

	public static void main(String[] args) {
		int a, b, c, d;
		
		a = 6;
		b = 10;
		
		c = --a * b++;
		
		d = a + b;
		
		System.out.println("c의 값은 " + c + ", d의 값은" + d + "입니다.");
	}
}
