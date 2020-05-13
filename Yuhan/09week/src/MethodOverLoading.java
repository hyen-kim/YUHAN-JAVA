
// 메소드 오버로딩 실습
public class MethodOverLoading {
// 주석 처리할 때는 ctrl + /
	
	// 매개 변수가 2개인 Calc
	public int Calc(int n1, int n2) {
		return n1 * n2;
	}
	// 매개변수가 int형인 Calc을 주석처리해도 RunMethodOverLoading에서는 에러가 발생하지 않음
	// 왜냐하면 double형을 매개변수로 갖는 메소드가 호출이 된다.
	// 정수값으로 받을 수 있는 메소드가 없을 경우에는 자동으로 형변환으로 해서 double형으로 호출

	// 매개 변수가 double형 2개인 Calc
	public double Calc(double n1, double n2) {
		return n1 * n2;
	}

	// 매개 변수가 3개인 Calc
	public int Calc(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}

}
