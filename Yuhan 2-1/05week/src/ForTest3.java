import java.util.Scanner;

public class ForTest3 {
	public static void main(String[] args) {
		
		int sum = 0;				// 합계를 누적할 변수
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("누적합계를 구하고자 하는 마지막 숫자 입력ㄴ : ");
		int lastNum = sc.nextInt();
		
		for (int i = 1; i <= lastNum; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.",lastNum, sum);
		
		sc.close();
	}
}
