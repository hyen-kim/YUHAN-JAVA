
public class ExceptionTest3 {
	public static void main(String[] args) {
		// int [] arr1 = {1, 2, 3, 4, 5}; // arr1을 선언과 동시에 초기화 할 수 있음
		int[] arr1 = new int[5];

		// arr1 배열에 값을 넣음
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;
		}
		// 배열의 인덱스 번호는 0~4까지 사용 가능
		for (int i = 0; i <= arr1.length; i++) {
			try {
				System.out.print(arr1[i] + "\t");
			} catch (ArrayIndexOutOfBoundsException e) {
				// 인덱스 번호를 초과하였을 때
				System.out.println("\n배열의 인덱스가 범위를 벗어났습니다. : " + i);
			}
		}
	}
}
