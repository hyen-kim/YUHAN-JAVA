
public class RunMethodOverLoading {
	public static void main(String[] args) {
		// 객체 생성 
		MethodOverLoading mo = new MethodOverLoading();
		
		// 오버로딩 예제 (매개변수 2개, 매개변수 3개)
		System.out.println("Calc(int n1, int n2) 호출 : " + mo.Calc(10, 20));
		System.out.println("Calc(double n1, double n2) 호출 : " + mo.Calc(10.1, 20.1));
		System.out.println("Calc(int n1, int n2, int n3) 호출 : " + mo.Calc(10, 20, 30));
	}
}
