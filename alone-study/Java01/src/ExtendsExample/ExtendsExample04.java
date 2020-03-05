package ExtendsExample;

/*
 * < 오버라이딩 > => 상속관계에서 이루어짐
 * - 부모 클래스의 '메소드'를 자식 클래스에서 다시 재정의하는 것
 * -> 오버로딩 -> 하나의 클래스 안에서 같은 함수명을 쓰되 매개변수를 다르게 한다.
 * 
 * - 주의사항
 * 1. 함수명이 같아야한다.
 * 2. 함수의 매개변수가 같아야한다.
 * 3. 리턴형이 같아야 한다.
 * 
 * */

public class ExtendsExample04 {
	public static void main(String[] args) {
		B1 Test = new B1();
		System.out.println(Test.Set(11)); 	// 결과는 12
		// 하위 클래스에서 오버라이딩 되었기 때문에 값이 11이 아니라 12가 출력이 된다.
	}
}


class A1{
	protected int m_nVar;
	public int Set(int nVar) {
		m_nVar = nVar;
		return m_nVar;
	}
}

class B1 extends A1{
	// 상속받은 A1 class와 함수명이 동일
	// 오버라이딩
	public int Set(int nVar) {
		m_nVar = nVar + 1;
		return m_nVar;
	}
}

