package Day01;

// 다중 for문 이용

public class _1for02 {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i <= 5) {
				for (int j = 0; j <= i; j++) {
					System.out.print("* ");
				}
			} else {
				for (int j = 10-i; j >= 0; j--) {
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
	}
}
