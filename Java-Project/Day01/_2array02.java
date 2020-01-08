package Day01;

import javax.swing.JOptionPane;

/*
 * 정렬 알고리즘
 * : 두 개의 배열요소를 비교하여 첫 번째 요소 값이 두 번째 요소보다 작으면 두 값을 교환하여
 *   가장 큰 값을 첫 번째 배열 요소로 이동시킨다.
 * 
 * 임의의 숫자 5개를 키보드로 입력 받아서 배열에 저장한 후,
 * 내림차순으로 정렬하여 출력하시오.
 * */

public class _2array02 {
	public static void main(String[] args) {
		System.out.println("5개의 숫자를 입력하세요");
		int[] array = new int[5];
		
		for (int i = 0; i < 5; i++) {
			array[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "번째 숫자 입력"));
		}
		
		// 정렬 : 버블 정렬 개념 ?
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (array[j] < array[j + 1]) {
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		
		// 정렬 후 출력
		System.out.println("======= 내림차순 =======");
		for (int i = 0; i < 5; i++) {
			System.out.printf(array[i] + " ");
		}
		
	}
}
