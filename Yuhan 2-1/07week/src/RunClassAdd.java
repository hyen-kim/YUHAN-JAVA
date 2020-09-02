
public class RunClassAdd {
	public static void main(String[] args) {	

		ClassAdd c1 = new ClassAdd();	// 객체 생성 -> 개본생성자로 생성
		ClassAdd c2 = new ClassAdd();
		// 다른 메모리공간에 생성
		
		int result1 = c1.addNum(12, 7);
		int result2 = c2.addNum(128, 534);
		// 둘은 다른 메모리에 있는 메소드이다.	=> 서로 다른 곳에 할당되어 있음
		
		System.out.printf("c1.addNum(12, 7)은 %d\n", result1);
		System.out.printf("c2.addNum(128, 534)은 %d\n", result2);
		// 서로 다른 객체이므로 서로 다른 메소드를 이용하여 결과를 확인
	}
}
