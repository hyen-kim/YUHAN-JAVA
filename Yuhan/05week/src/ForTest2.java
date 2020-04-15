
public class ForTest2 {
	public static void main(String[] args) {
		int sum = 0;	// 누적 변수
		
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("1 ~ 100 까지의 합계는 " + sum + "입니다.");
	}
}
