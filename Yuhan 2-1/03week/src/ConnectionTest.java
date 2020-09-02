
public class ConnectionTest {

	public static void main(String[] args) {
		// 정수형 변수 n1과 n2 선언
		int n1 = 10;
		int n2 = 25;

		System.out.println("n1 + n2 = " + n1 + n2);	
		// 앞부터 순차적으로 연산을 하므로
		// 문자열과 정수를 더하면서 문자로 바뀐 후에 다시 정수를 더했으므로 문자형 1025로 출력
		
		System.out.println("n1 + n2 = " + (n1 + n2));
		// 정수 연산을 한 후에 문자열을 더했으므로 35 출력
		
		System.out.println(n1 + n2 + "입니다.");
		// 앞부터 연산을 하였으므로 35 출력
	}

}
