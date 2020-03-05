package InterfaceExample;
/*
 * 추상 클래스와 인터페이스의 비교, 형식, 인터페이스 상속
 * 
 * < 추상 클래스와 인터페이스 비교 >
 * 
 * - 공통점
 * 	1. 상위 클래스로만 사용 가능
 * 	2. 하위에서 구현할 함수의 원형을 선언
 * 	-> 추상메소드가 존재
 * 
 * - 차이점
 * 	1. 추상 클래스 = 일반 멤버 + 추상 메소드
 * 	       인터페이스 = 추상 메소드 + 상수 ****
 * 	2. 추상 클래스는 추상 메소드를 일부 구현 가능
 *     인터페이스는 모두 구현해야 함 (강제적)
 *  3. 다중 상속 가능
 *  -> 하나의 클래스에서 다중 상속된 인터페이스의 추상 메소드를 다 구현해야함.
 *  4. 인터페이스가 인터페이스를 다중 상속
 *  -> 상위 하위 개념이 나뉘어짐
 *  
 * < 인터페이스 >
 * - 기본형식
 * interface 인터페이스명 {
 * 		public static final 데이터형 변수명 = 값;
 * 		public abstract 리턴형 메소드명 (매개변수0....n);
 * } 
 *
 * - 상속 형식
 * interface 인터페이스명 {}
 * 
 * class 클래스명 implements 인터페이스명 {}
 * 
 * 인터페이스명 관례 : ~able
 * 
 * - 다중 상속
 * interface A {
 * 		void PrintA();
 * }
 * interface B {
 * 		void PrintB();
 * }
 * interface C extends A,B {	// A, B 다중 상속
 * 		void PrintC();
 * }
 * 
 * - 클래스 상속과 인터페이스 다중 상속
 * interface A {
 * 		void PrintA();
 * }
 * interface B {
 * 		void PrintB();
 * }
 *	class C {	
 * 		public void PrintC();			// 생략
 * } 
 * class D extends C implements A, B {
 * 		// A, B는 반드시 구현해야함.
 * }
 * */


// 기본형식
public class InterfaceExample01 {
	public static void main(String[] args) {
		A Test = new A();
		Test.Print();	
	}
}

interface InterfaceA{
	int m_nVar = 7;		// 상수화된 변수라는 것을 기억
	void Print();		// 추상메소드라는 것을 기억
}

class A implements InterfaceA{
	public void Print() {
		System.out.println("Interface : " + m_nVar);
	}
}
