
public class ArrayTest3 {
	public static void main(String[] args) {
		// 3행 4열의 2차원 동적배열 (행마다 열의 길이가 다른 배열)
		int[][] nums = new int[3][];
		
		int cnt = 1;
		
		// [0]행 1 
		// [1]행 2 3
		// [2]행 4 5 6

		for (int i = 0; i < nums.length; i++) {
			nums[i] = new int[i+1];	// 열의 길이를 정해줌
			// 동적배열에서는 각 행에 열에 대한 객체 생성이 필요
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
