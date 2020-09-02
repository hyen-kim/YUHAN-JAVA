// 리턴값이 있는 메소드
public class ReturnMethod {
	public static int sum(int n1, int n2) {
		int sum = n1 + n2;
		return sum;	// sum값을 리턴
		// 다양성으로 인해 동일한 메소드 이름과 동일한 멤버변수로 사용 가능
	}
	
	
	public static void main(String[] args) {
		int n1, n2;
		n1 = 11; n2 = 66;
		
		int result = sum(n1, n2);	// sum 메소드를 호출하여 n1과 n2값을 더한값을 리턴받음
		System.out.printf("%d + %d = %d\n", n1, n2, result);
		
		n1 = 222; n2 = 333;
		result = sum(n1, n2);
		System.out.printf("%d + %d = %d\n", n1, n2, result);
	}
}
