import java.util.Scanner;

public class Gugudan3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("단을 입력하세요 : ");
		int dan = sc.nextInt();
		
		System.out.printf("구구단 %d단 입니다.\n", dan);
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\t", dan, i, (dan*i));
			if((i%3) == 0) {
				System.out.println();
			}
		}
		sc.close();
	}
}
