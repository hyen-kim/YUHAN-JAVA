
public class ArrayTest2 {
	public static void main(String[] args) {
		// 3행 4열의 2차원 배열
		int[][] nums = new int[3][4];
		int cnt = 1;
		// [0]행 1 2 3 4
		// [1]행 5 6 7 8
		// [2]행 9 10 11 12

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = cnt++;
			}
		}
		
		// 2차원 배열에 잘 들어갔는지 출력
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
