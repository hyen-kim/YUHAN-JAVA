package LoopExample;

import java.util.Scanner;

public class SumTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("* 합계구할 마지막 수 입력 : ");
		int lastNum  = s.nextInt();
		int sum = 0;
		for (int i = 0; i < lastNum; i++) {
			sum += i+1;
			if((i+1) == lastNum)
				System.out.printf("%d ", i+1);
			else
			System.out.printf("%d + ", i+1);
		}
		System.out.printf("= %d", sum);
		s.close();
	}
}
