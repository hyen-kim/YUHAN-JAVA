package ClassExample03;
/*
 * 내부 클래스(inner class)와 익명 클래스(anonymous class)
 * 
 * 내부 클래스 
 * 
 * 개념 
 * - 클래스 안에 클래스를 정의하는 것
 * - 내부 클래스는 외부 클래스의 모든 자원 사용 가능
 * 
 * 기본형식
 * class 클래스명 {
 * 		class 내부클래스명 {
 * 			 // 멤버 변수, 메소드, 생성자
 * 		}
 * }
 * 
 * 특징
 * - new로 생성
 * - 내부 클래스는 외부 클래스의 모든 자원 사용
 * - 외부 클래스를 통해 내부 클래스 사용
 * - 선언에 따라 인스턴스 내부 클래스, 정적 내부 클래스, 지역 내부 클래스로 나눌 수 있다
 * 
 * 사용방법
 * - 외부 클래스에서 new를 통해 내부 클래스를 생성하고 메소드를 호출하는 예
 * - 정적 내부 클래스의 사용 예
 * - 외부 클래스 메소드에서 내부 클래스를 사용하는 예 ( 지역 클래스 )
 * */

public class InnerExample01 {
	public static void main(String[] args) {
		OutClass Test = new OutClass();
		Test.Inner.Print();
	}
}

class OutClass{
	int nVar1 = 3;
	
	class InnerClass {
		void Print() {
			System.out.println("InnerClass : " + nVar1);
		}
	}
		InnerClass Inner = new InnerClass();
}

