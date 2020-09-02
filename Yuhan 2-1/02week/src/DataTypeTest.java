
public class DataTypeTest {
	//		단어가 바꿀 때마다 왠만하면 대문자로 변경
	public static void main(String[] args) {
		
		// Non-Numeric Type ( 숫자가 아닌형 )
		
		boolean b = true;	// true, false만 입력
		char c = 'A';
		char c2 = 98;
		
		System.out.println("c2 = " + c2);	// b가 나옴
		// 98에 해당하는 문자값이 나온다는 말
		System.out.println("c2 = " + (c2+1));	// 99가 나옴
		// 덧셈연산을 수행하면서 데이터형이 정수형으로 바뀌었기 때문에
		System.out.println("c2 = " + (char)(c2+1));	// c가 나옴	// <-- 강제형변환
		// 정수형을 다시 문자형으로 형 변환한 예
		
		
		// Numeric Type ( 숫자형 )
		
		// 정수형 : byte, short, int, long
		byte bb = 127;	// 2^-7 ~ 2^7 
		// byte bb = 128; 을 쓰면 에러 발생 
		// why ? 자료형의 범위를 초과하였기 때문에 
		// 옆에 노란색 느낌표가 뜨는 이유는 선언은 해놓고 쓰지 않았다는 의미
		short s = bb;		// <-- 묵시적 형변환
		s = 128;
		
		int i = s;
		i = 1000000;
		
		long l = i;			// <-- 묵시적 형변환 ( 작은값 -> 큰값 )
		l = 1000000000;
		
		// 실수형 : float, double
		float f = l;	// 정확하게 long형 값이 아니라 잘려서 들어감
		System.out.println(f);
		// f = 3.14; => 3.14은 f가 붙지 않아서 double형으로 인식되어서 값은 대입이 되지 않음	
		f = 3.14f;
		
		double d = 6.17;
		
		d = 300/3;
		System.out.println("300 / 3 = " + d); // 100.0
		// why ? 자동형 변환이 일어났기 때문에 d의 자료형은 double이기 때문에
	}
}
