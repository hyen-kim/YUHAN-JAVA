// 구구단 예제 : 단 수 입력 후 출력 

package LoopExample;

import java.util.Scanner;
public class GuGUdan3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
		System.out.print("* 단수를 입력하세요 : ");
		int dan = s.nextInt();
		System.out.printf("===== %d단을 출력합니다. =====\n", dan);
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\t", dan, i, dan*i);
			if(i % 3 == 0)
				System.out.println();
		}
			System.out.println("* 계속 하시겠습니까?(계속 : 1, 종료 :0)");
			int cont = s.nextInt();
			if(cont==0)
				break;
		}
s.close();
	}

}
