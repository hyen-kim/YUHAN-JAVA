import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		// 입력값이 짝수인지 홀수인지 알아맞추는 예제

		Scanner sc = new Scanner(System.in);
		System.out.println("1~10 사이의 정수 값 입력 : ");
		int su = sc.nextInt();

		// 교수님이 사용하신 switch문
		switch (su) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.printf("입력한 숫자 %d는(은) 홀수입니다.\n", su);
			break;
		case 2:
		case 4:
		case 6:
		case 8:
		case 10:
			System.out.printf("입력한 숫자 %d는(은) 짝수입니다.\n", su);
			break;
		default :
			System.out.println("1~10까지의 정수 입력만 가능합니다.");
		}

		// 내가 생각한 switch문 : 1~10의 값이 아니여도 짝수와 홀수의 값을 구할 수 있습니다.
		// switch() : 정수, 문자, 문자열
		switch (su % 2) { // su를 2로 나눈 나머지의 값을 넘기겠다.
		case 0: // 나머지가 0일 때 즉 짝수일 때
			System.out.printf("입력한 숫자 %d는(은) 짝수입니다.\n", su);
			break;

		default: // 나머지가 1일 때 즉 홀수 일 때
			System.out.printf("입력한 숫자 %d는(은) 홀수입니다.\n", su);
			break;
		}
		

		sc.close();
	}
}
