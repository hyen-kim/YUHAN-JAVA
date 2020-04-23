import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 입력 : ");
		n1 = sc.nextInt();
		System.out.print("정수 2 입력 : ");
		n2 = sc.nextInt();

		try {	// 예외 가능성이 있는 문장
			int result = n1 / n2;
			System.out.printf("%d / %d = %d\n", n1, n2, result);
		} catch (ArithmeticException e) { // 예외가 있다면 처리해줄 문장
			// 0으로 나눌 때 발생하는 에러
			System.out.println("분모는 0이면 안됩니다.");
		}
		
	}
}
