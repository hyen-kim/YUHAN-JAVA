import java.util.Scanner;

public class SimpleIfTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적 입력 : ");
		int score = sc.nextInt();	
	
		if(score >= 90) {
			// 90 점 이상인 점수가 score에 들어갔을 경우에만 실행된다.
			System.out.println(">> 우수한 성적입니다.");
		}else {
			// 위의 if문이 거짓일 경우 실행
			System.out.println(">> 좀 더 노력하시면 좋을 것 같습니다.");
		}
		
		System.out.printf(">> 당신의 점수는 %d점 입니다.", score);
		sc.close();	// 굳이 닫아줄 필요는 없지만 닫아주는 습관을 들이는 것이 좋다.
	}
}
