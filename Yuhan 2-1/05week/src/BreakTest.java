import java.util.Scanner;

public class BreakTest {
	public static void main(String[] args) {
		// 특정 입력 값을 받으면 프로그램이 멈추게 작성
		Scanner sc = new Scanner(System.in);
		String msg = "";
		
		while (true) {
			System.out.printf("좋아하는 과일 입력 : ");
			msg = sc.nextLine();
			if(msg.equals("quit")) {	// 문자를 비교할 때는 .equals
				System.out.println("프로그램이 종료됩니다.");
				break;
			}
			System.out.println(msg + "입니다.");
		}
		sc.close();
	}
}
