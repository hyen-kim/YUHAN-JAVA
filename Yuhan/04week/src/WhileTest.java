import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		
//		사용자가 값을 알고 있는 상태에서 반복문 돌리기
//		int i = 0;
//		
//		while(i < 5) {	// 0 ~ 4 => 5번 실행
//			System.out.println(">> 반복문 실행");
//			i ++;	//i값 증감식
//		}

		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		// 사용자가 값을 임의로 값을 입력하게 해서 반복문 돌리기
		while(true) {	// 무한루프
			System.out.print("정수값 입력 : ");
			num = sc.nextInt();
			System.out.printf(">> 입력한 값은 %d 입니다.\n", num);
			
			if(num == 0) {
				System.out.println(">> 0을 입력했으므로 프로그램이 종료됩니다.");
				break;	// while을 빠져나온다는 말
			}
		}// 이런식으로 반복횟수를 모를 때 while문을 사용하는 것이 좋다.
		
		sc.close();
	}
}
