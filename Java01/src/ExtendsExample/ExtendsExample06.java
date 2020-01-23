package ExtendsExample;

/*
 * < 상속관계에서 생성자의 호출순서 >
 * 
 * 1. 상위 클래스 생성자에서부터 하위 클래스 생성자 호출
 * 2. 생성자에 매개변수가 있는 경우 자동호출 안됨 -> super 키워드 사용
 * 
 * */

public class ExtendsExample06 {
	public static void main(String[] args) {
		// 객체를 생성하는 것 자체가 생성자를 호출하는 것임.
		// 상위 클래스에서부터 하위 클래스까지 호출.
		// A -> B-> C 순으로 호출.
		C6 Test = new C6();
	}
}

class A6 {
	// 생성자
	public A6() {
		System.out.println("constructor of the A");
	}
}
class B6 extends A6 {
	// 생성자
	public B6() {
		System.out.println("constructor of the B");
	}
}

class C6 extends B6{
	// 생성자
	public C6() {
		System.out.println("constructor of the C");
	}
	
}