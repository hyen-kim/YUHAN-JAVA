// 매개변수 2개를 전달하여 출력하는 메소드
public class ParmeterTest {
	public static void add(int n1, int n2) {
		int result = n1 + n2;
		System.out.printf("%d + %d = %d\n", n1, n2, result);
	}
	
	public static void main(String[] args) {
		add(11, 55);
		add(300, 222);
		add(2019, 33);
	}
}
