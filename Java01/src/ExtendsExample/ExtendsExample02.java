package ExtendsExample;

import ExtendsExampleTest.C;

/*
 * < protected 사용예 >
 * 1. 같은 패키지 안에서 protected 멤버의 사용
 * 2. 다른 패키지의 protected 멤버 사용
 * */
public class ExtendsExample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTest Test = new BTest();
		Test.PrintATest();			// 같은 패키지, 상위 멤버 호출
		Test.m_nVar1 = 13;			// 상위 클래스에 있는 멤버변수에 값을 넣음
		Test.printCTest();
		System.out.println(Test.m_nVar1);
		
		D Test2 = new D();	// 서로 다른 패키지
		Test2.PrintD();		// 하위 클래스 안에서만 
		// Test2.m_nVar1 = 40; error 발생
		// System.out.println(Test2.m_nVar1); error 
		
	}

}

class ATest{
	protected int m_nVar1 = 11;
	protected void PrintATest () {
		System.out.println("A Class : " + m_nVar1);
	}
}

class BTest extends ATest{
	public void printCTest() {
		System.out.println("B Class " + m_nVar1);	// A클래스에 있는 멤버변수
	}
}

class D extends C {
	public void PrintD() {
		System.out.println("D Class " + m_nVar1);
	}
}
