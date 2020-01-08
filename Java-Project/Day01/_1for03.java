package Day01;

//for문 활용

public class _1for03 {
	public static void main(String[] args) {
		char A = 'A';
		for (int i = 0; i <= 25; i++) {
			for (int j = 0; j <= 25 - i; j++) {
				System.out.printf("%c ", A + j);
			}
			System.out.println("");
		}

	}
}
