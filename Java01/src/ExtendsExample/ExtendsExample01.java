package ExtendsExample;
/*
 * < 상속 > -> 클래스와 클래스를 연관 
 * - 객체와 객체를 연관시키고 '계층구조'를 만들어 코드를 재사용
 * - 부모클래스, 상위클래스, parent class, super class		<-- 형질을 주는 클래스
 * - 자식클래스, 하위클래스, child class, sub class		<-- 형질을 받는 클래스
 * - 오직 한 클래스만을 상속할 수 있다.							<-- 다중 상속 X
 * 
 * => Object 최상위 클래스이다.
 * 
 * - 하위 클래스에서는 상위 클래스에서 만들거나 선언한 변수들을 하위 클래스에서 그대로 사용 가능
 * - 하위 클래스에서 작성하고자 하는 코드가 상위 클래스에 있다면 재사용 가능
 * - 상속관계를 통하면 코딩하지 않더라도 그대로 사용가능 : 효율성이 높음
 * 
 * (1) 상속 형식
 * class 클래스명 extends 상속 클래스명
 * {	// 자식 			부모 
 * }
 * - 모든 클래스의 부모 클래스 -> Object
 * - 상위 클래스의 접근지정자에 따라 접근이 제한	
 * 
 * < 멤버상속 >
 * 첫째, 상위 클래스에 지정된 private 멤버는 해당 클래스에서만 사용할 수 있고
 * 하위 클래스에서는 사용할 수 없다.
 * 
 * 둘째, 상위 클래스에 지정된 public 멤버는 해당 클래스뿐만 아니라
 * 하위 클래스에서도 사용할 수 있으며 '외부'에서도 언제든지 사용할 수 있다.
 * -> 다른 클래스에도 호출이 가능하다는 말
 * 
 * 셋째, protected의 상위 멤버는 '같은 패키지'일 때는 public 멤버처럼 사용되지만
 * 다른 패키지인 경우는 상위 멤버를 하위 클래스 안에서만 사용할 뿐 '외부' 사용은 할 수 없다.
 * 
 * 넷째, 상위 클래스에서 default 멤버들은 같은 패키지 안에 있을 때는 public 멤버처럼 사용할 수 있지만
 * 패키지가 다른 경우는 하위 클래스에서 상위 클래스 default 멤버를 사용할 수 없고 외부에서도 사용할 수 없다. 
 * */

public class ExtendsExample01 {
	public static void main(String[] args) {
		A TestA = new A();
		TestA.PrintB();			// public 이니까 선언 가능
		
		// B Test = new B();
		// Test.PrintC(); 		//error 발생
		
		B TestB = new B();
		TestB.PrintB();			// public 이니까 선언 가능
	}
}


class A {
	private int m_nVar1 = 11;
	
	private void PrintA() {
		System.out.println("A Class " + m_nVar1);
	}
	public void PrintB() {
		PrintA();
		// private 속성은 클래스 안에서만 사용 가능
	}
}

class B extends A{
	void PrintC(){
		//PrintA();	// 상위 private 속성, error 발생
		PrintB();
		// System.out.println(m_nVar1);// 상위 private 멤버변수, error 발생
	}
}
