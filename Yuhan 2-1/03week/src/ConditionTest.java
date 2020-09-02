
public class ConditionTest {
	public static void main(String[] args) {
		
		int age = 15;	// 정수형 age 선언
		String msg;		// 문자열을 가질 수 있는 msg변수 선언 
		
		// 삼항연산자 
		// msg = age >= 20 ? "성인" : "청소년";

		// 조건문 (if~else)
		if (age >= 20) // age가 20보다 크거나 같을 경우
			msg = "성인";
		
		else			// 위의 조건이 참이 아닌 경우 
			msg = "청소년";
		
		// 위의 조건문이 참이든 거짓이든 출력되는 문장
		System.out.println("당신은 " + msg + " 입니다.");
	}

}
