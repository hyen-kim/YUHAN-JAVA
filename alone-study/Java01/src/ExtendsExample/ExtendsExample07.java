package ExtendsExample;
/*
 * < super >
 * - 하위 클래스에서 상위 클래스를 참조하여 접근할 때 사용
 * 
 * (1) 형식
 * super.멤버 변수명
 * super.메소드명(매개변수)
 * 
 * (2) 사용
 * 1. 하위 클래스에서 상위 클래스의 메소드나 변수를 호출할 때 사용	-> super. 
 * 2. 하위 클래스에서 상위 클래스의 생성자를 호출할 때 super(매개변수) 또는 super()와 같이 사용
 * -> 하위 클래스의 생성자 맨 첫줄에 있어야한다.
 * 
 * */

public class ExtendsExample07 {
	public static void main(String[] args) {
		B7 Test = new B7();
		Test.Print();
	}
}

class A7 {
	protected void Print() {
		System.out.println("A Class");
	}
}
class B7 extends A7 {
	public void Print() {
		super.Print();		// 위의 함수를 호출 
		// super.Print를 쓰지 않으면 A class는 나오지 않음.
		System.out.println("B Class");
	}
}
