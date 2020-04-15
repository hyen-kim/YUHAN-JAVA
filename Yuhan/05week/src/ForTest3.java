import java.util.Scanner;

public class ForTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("수를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;				// 합계를 누적할 변수
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.",num, sum);
	}
}
