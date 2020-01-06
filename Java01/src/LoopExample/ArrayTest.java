package LoopExample;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int[] scores = new int[5];
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("* %d. 성적을 입력하세요 : ", i+1);
			scores[i] = s.nextInt();
			sum += scores[i];
		}
		double avg = (double)sum / scores.length;
		//출력
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "  ");
		}
		System.out.println();
		System.out.printf("* 합계 : %d, 평균 : %.1f", sum, avg);
		s.close();
	}

}
