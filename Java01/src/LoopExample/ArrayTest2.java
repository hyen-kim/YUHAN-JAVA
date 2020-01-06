package LoopExample;

public class ArrayTest2 {

	public static void main(String[] args) {
		//자바는 동적 배열을 사용한다.(Dynamic Array)
		int[][] arr = new int[3][];
		int num = 1;
		
		for (int i = 0; i < arr.length; i++) {
			//arr.length 행의 크기 arr[0].lenght 열의 크기
			arr[i] = new int [4-i];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		//출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
