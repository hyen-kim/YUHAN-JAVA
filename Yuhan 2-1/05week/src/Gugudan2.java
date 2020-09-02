// 구구단 세로로 출력하는 예제
public class Gugudan2 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {	// 행
			for (int j = 2; j < 10; j++) {	// 열
				System.out.printf("%d * %d = %d\t", j, i, (j*i));
			}
			System.out.println();
		}
	}
}
