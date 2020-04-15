// 구구단 가로로 출력하는 예제
public class Gugudan1 {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {	// 행
			for (int j = 1; j < 10; j++) {	// 열
				System.out.printf("%d * %d = %d\t", i, j, (i*j));
			}
			System.out.println(); // 한단 다 출력하고 줄 바꿈
		}
	}
}
