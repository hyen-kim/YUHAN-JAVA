import java.util.Scanner;

public class Ex3_2 {
	public static void main(String[] args) {
		// 점수를 입력 받는 부분
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();

		// 점수에 따라 학점을 계산하는 if문
		char scoreMsg;

		if (score >= 90) {
			scoreMsg = 'A';
		} else if (score >= 80) {
			scoreMsg = 'B';
		} else if (score >= 70) {
			scoreMsg = 'C';
		} else if (score >= 60) {
			scoreMsg = 'D';
		} else {
			scoreMsg = 'F';
		}
		
		// 최종 점수와 학점을 출력하는 부분
		System.out.printf("점수 %d 의 학점은 %c 입니다.", score, scoreMsg);
	}
}
