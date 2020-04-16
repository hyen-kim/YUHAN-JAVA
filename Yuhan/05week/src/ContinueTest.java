
public class ContinueTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {

			if ((i % 2) == 1) {
				// i가 홀수면 밑에 문장을 실행하지 않고 위로 올라간다.
				continue;
			}
			System.out.printf("%d\t", i);
		}
		System.out.println("\n짝수만 출력이 되었네요 ~");
	}
}
