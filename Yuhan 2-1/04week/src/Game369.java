import java.util.Random;
import java.util.Scanner;

public class Game369 {
	public static void main(String[] args) {
		// 수업과정 외 코딩

		Scanner sc = new Scanner(System.in);
		int me = 0;
		int cnt = 1;

		int gamesu = 0;
		int jinsu = 10;
		int jin = 1;

		boolean game = true;
		
		System.out.println("삼육구 삼육구 삼육구 삼육구 ! 시작 !");
		// 게임시작
		while (game) {
			gamesu++; // 게임숫자 증가
			// 10, 20, 30 자리수가 넘어갈 때마다 빼줄려고 만들어놈.
			if (gamesu >= jinsu) {
				jin = jinsu;
				jinsu += 10;
			}

			if ((cnt % 2) == 0) { // 컴퓨터와 내가 반복하여
				System.out.print("나 숫자 입력 : ");
				me = sc.nextInt();
				
				if (me == gamesu) { // 내가 입력한 숫자가 맞는지 확인하는 부분
					System.out.println("-----------------");
				} else if (((gamesu % jin) == 3) || ((gamesu % jin) == 6) || ((gamesu % jin) == 9)) {
					System.out.println("-----------------");
				} else {
					System.out.println("게임 OVER ------");
					game = false;
				}
			} else { // 컴퓨터 차례 
				System.out.println("컴퓨터 숫자 입력 : " + gamesu);
			}
			cnt++;

		}
		sc.close();
	}
}
/*
 * error ?
 * 일의 자리 6을 인식하지 못함...
 * 애초부터 코드 자체가 복잡함
 * 나중에 제대로 수정..
 * */
