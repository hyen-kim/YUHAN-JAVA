import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2_1 {

	public static void main(String[] args) {
		Scanner sc = null;
		int num1, num2;
		
		try {
			System.out.print(">> 정수 입력(분자) : ");
			num1 = sc.nextInt();
			System.out.print(">> 정수 입력(분모) : ");
			num2 = sc.nextInt();
			System.out.printf("%d ÷ %d = %d\n", num1, num2, num1/num2);
		}catch (ArithmeticException e) {
			// 분모가 0일 경우
			System.out.println("분모에 0을 입력할 수 없습니다.");
		}catch (InputMismatchException e) {
			// 입력한 값에 문자가 들어간 경우
			System.out.println("정수를 입력하여주세요.");
		}catch (NullPointerException e) {
			System.out.println("scanner 객체를 생성하지 않고 사용했습니다.");
		}finally { 
			// 무조건 실행
			System.out.println("프로그램을 종료합니다.");
		}
		
		sc.close();
		
	}
}
