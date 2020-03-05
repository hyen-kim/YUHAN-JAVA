package ClassExample02;

/*
 *  < static >		-> 싱글톤하고 접목됨 
 *  
 *  - 접근제어자 static 데이터형 멤버변수명;
 *  - 접근제어자 static 리턴형 메소드명(..);		<-- 함수명에도 붙인다.
 *  => 객체를 생성하지 않고도 함수를 호출해서 사용 가능한 기능이 부여됨
 *  => A라는 클래스 안에 K라는 변수가 있다면 new로 A라는 객체를 생성을 해야만 K를 사용할 수 있는데,
 *     static으로 선언하면 A.k로 바로 호출 가능.
 *  
 *  (1) static 멤버변수와 메소드의 공통점
 *  - 객체가 생성되기 이전에 멤버변수와 메소드 사용 가능
 *  
 *  (2) static 멤버변수의 특징
 *  - 멤버변수는 생성되는 모든 객체에서 전역변수로 사용
 *  
 *  (3) static 멤버변수와 메소드의 사용규칙
 *  - static 메소드 안에서 멤버 변수를 사용할 때
 * 	    멤버변수는 항상 static으로 선언된 것만을 사용할 수 있다.
 * 	- static 메소드는 같은 클래스 안의 static 메소드만을 호출할 수 있다.
 *  - static 메소드안에서 this를 사용할 수 없다.
 *  - static 메소드는 오버라이딩을 할 수 없다. 
 *  
 * */

public class ClassExample05 {
	public static void main(String[] args) {
		B.m_nVar = 5;
		B Test1 = new B();
		B Test2 = new B();
		System.out.printf("%d, %d\n",Test1.m_nVar, Test2.m_nVar);
		
		Test1.m_nVar = 1;
		System.out.printf("%d, %d\n",Test1.m_nVar, Test2.m_nVar);
		
		// static을 이용하였기 때문에 B.메소드명으로 호출 가능
		B.Print();
	}
}

class B {
	public static int m_nVar;
	
	public static void Print() {
		System.out.println("Java Programming");
	}
}
