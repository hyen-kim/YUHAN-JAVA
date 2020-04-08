import java.util.Scanner;

public class IfElseTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
		System.out.print("성적 입력 : ");
		int score = sc.nextInt();	// 정수값을 입력 받겠다는 말
	
		// 단순 조건문 ( if문 )
		if(score >= 90) {
			// 90 점 이상인 점수가 score에 들어갔을 경우에만 실행된다.
			System.out.println(">> 우수한 성적입니다.");
		}
		
		System.out.printf(">> 당신의 점수는 %d점 입니다.", score);
		sc.close();	// 굳이 닫아줄 필요는 없지만 닫아주는 습관을 들이는 것이 좋다.
	}
}
