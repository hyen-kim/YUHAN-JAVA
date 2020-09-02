public class ForTest1 {
	public static void main(String[] args) {
		// for문은 반복횟수를 명확히 알 때 사용하는 것이 좋다.
		for (int i = 0; i < 100; i++) {
			System.out.print(i + 1 + "\t");	// 특수문자 : tab
			if(((i+1) % 7) == 0) {
				System.out.println();
			}
		}
	}
}
