import java.util.Scanner;

public class ArrayTest1 {
	public static void main(String[] args) {
		// 1차원 배열 실습
		Scanner sc = new Scanner(System.in);
		int [] nums = new int[5];	// int형 배열 5개 생성
		int total = 0;
		
		for (int i = 0; i < nums.length; i++) {	// .length : 길이
			System.out.printf(">> %d. 숫자 입력 : ", i+1);
			nums[i] = sc.nextInt();
			total += nums[i];
		}
		
		double avg = (double)total / nums.length;	
		// 강제 형 변환
		
		for (int i = 0; i < nums.length; i++) {
			System.out.printf(nums[i] + "\t");
		}
		
		System.out.println();
		System.out.println(">> 합계 : " + total);
		System.out.printf(">> 평균 : %.2f ", avg);
		sc.close();
	}
}
